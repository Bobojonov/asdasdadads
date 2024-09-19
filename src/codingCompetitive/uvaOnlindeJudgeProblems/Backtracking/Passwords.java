package codingCompetitive.uvaOnlindeJudgeProblems.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Passwords {
    static String rule;
    static int numWords;
    static String[] words;
    static String[] res = new String[300];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            int t = Integer.parseInt(s);
            words = new String[105];
            int i = 0;
            while (t --> 0) words[i++] = br.readLine();
            numWords = i;
            System.out.println("--");
            t = Integer.parseInt(br.readLine());
            while (t --> 0) {
                rule = br.readLine();
                recursive(0);
            }
        }
    }
    public static void recursive(int idx) {
        if (idx == rule.length()) {
            for (int i = 0; i < idx; i++)
                System.out.print(res[i]);
            System.out.println();

        } else {
            if (rule.charAt(idx) == '#') {
                for (int i = 0; i < numWords; i++) {
                    res[idx] = words[i];
                    recursive(idx + 1);
                }
            } else {
                for (int i = 0; i <= 9; i++) {
                    res[idx] = String.valueOf(i);;
                    recursive(idx + 1);
                }
            }
        }
    }

}
