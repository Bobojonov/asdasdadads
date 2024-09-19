package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        String date = "25 5 1999";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(date, dtf);


    }

    private static String getDayOfWeek(String date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(date, dtf);
        return ld.getDayOfWeek().toString();
    }
}
