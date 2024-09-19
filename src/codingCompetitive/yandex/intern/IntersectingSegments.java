package codingCompetitive.yandex.intern;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class IntersectingSegments {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            segments[i] = new Segment(start, end);
        }
        System.out.println(n - countIntersects(segments));
        reader.close();
        writer.close();
    }

    static class Segment implements Comparable<Segment> {
        int start, end;

        Segment(int start, int end) {
            this.end = end;
            this.start = start;
        }

        @Override
        public int compareTo(Segment o) {
            if (this.end == o.end)
                return Integer.compare(this.start, o.start);
            return Integer.compare(this.end, o.end);
        }
    }

    public static int countIntersects(Segment[] segments) {
        Arrays.sort(segments, Comparator.comparingInt(s -> s.start));
        for (int i = 0; i < segments.length; i++) {
            System.out.println(segments[i].start + " " + segments[i].end);
        }
        TreeSet<Segment> activeSegments = new TreeSet<>();
        int cnt = 0;
        for (Segment segment : segments) {
            while (!activeSegments.isEmpty() && activeSegments.first().end < segment.start) {
                activeSegments.pollFirst();
            }
            if (activeSegments.isEmpty() || activeSegments.ceiling(segment) == null)
                cnt++;
            activeSegments.add(segment);
        }
        return cnt;
    }
}
