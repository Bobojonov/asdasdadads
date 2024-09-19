package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingChaos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine().replace(":", "");
            int h = Integer.parseInt(s.substring(0, 2));
            int m = Integer.parseInt(s.substring(2));
            while (true) {
                if (m == 59)
                    h = (h + 1) % 24;
                m = (m + 1) % 60;
                if(isPalindrome(h, m)) break;
            }
            String res = Integer.toString(h * 100 + m);
            for (; res.length() < 4;)
                res = "0" + res;
            System.out.println(res.substring(0, 2) + ":" + res.substring(2));

        }
    }
    public static boolean isPalindrome(int h, int m) {
        String s = Integer.toString(h * 100 + m);
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        return true;
    }
}
