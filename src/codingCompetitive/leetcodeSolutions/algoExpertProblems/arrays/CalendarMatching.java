package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalendarMatching {

    public static List<StringMeeting> calendarMatching(
            List<StringMeeting> calendar1,
            StringMeeting dailyBounds1,
            List<StringMeeting> calendar2,
            StringMeeting dailyBounds2,
            int meetingDuration) {
        ArrayList<StringMeeting> blocks = new ArrayList<>(calendar1);
        blocks.add(new StringMeeting(String.valueOf(0), dailyBounds1.start));
        blocks.add(new StringMeeting(dailyBounds1.end, String.valueOf(60 * 24)));
        blocks.addAll(calendar2);
        blocks.add(new StringMeeting(String.valueOf(0), dailyBounds2.start));
        blocks.add(new StringMeeting(dailyBounds2.end, String.valueOf(60 * 24)));
        blocks.sort(Comparator.comparing(StringMeeting::start));
        int possibleStart = 0;
        ArrayList<StringMeeting> free = new ArrayList<>();
        for (StringMeeting meeting : blocks) {
            if (Integer.parseInt(meeting.end) <= possibleStart)
                continue;
            if (Integer.parseInt(meeting.start) > possibleStart) {
                int len = Integer.parseInt(meeting.start) - possibleStart;
                if (len >= meetingDuration)
                    free.add(new StringMeeting(String.valueOf(possibleStart), meeting.start));
            }
            possibleStart = Integer.parseInt(meeting.end);
        }
        return free;
    }

    static class StringMeeting {
        public String start;
        public String end;

        public StringMeeting(int start, int end) {
            this(minutesToString(start), minutesToString(end));
        }

        public StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
        }

        int start() {
            return stringToMinutes(start);
        }

        int end() {
            return stringToMinutes(end);
        }

        private static String minutesToString(int minutes) {
            return minutes / 60 + ":" + (minutes % 60 < 10 ? "0" : "") + minutes % 60;
        }

        private static int stringToMinutes(String str) {
            String[] parts = str.split(":");
            return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }
    }

}
