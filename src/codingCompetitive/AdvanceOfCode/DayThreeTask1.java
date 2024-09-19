package codingCompetitive.AdvanceOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayThreeTask1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            Set<Character> lower = new HashSet<>();
            Set<Character> upper = new HashSet<>();
            for (char c: s.substring(0 ,s.length() / 2).toCharArray())
                lower.add(c);
            for (char c: s.substring(s.length() / 2).toCharArray())
                upper.add(c);
            lower.retainAll(upper);
            for (char c: lower) {
                sum += c >= 'a' ? c - 'a' + 1: c - 'A' + 27;
            }
        }
        System.out.println(sum);
    }
}
