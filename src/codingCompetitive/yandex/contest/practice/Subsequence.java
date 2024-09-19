package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        System.out.println(check(s, t));
    }

    public static boolean check(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1 == 0 || s.equals(" ") || s.equals(t)) return true;
        int i = 0, j = 0;
        while (i < len2) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j >= len1)
                    return true;
            }
            i++;
        }
        return false;
    }
}
