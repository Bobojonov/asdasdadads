package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems.Palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquarePalindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int cases = 1; cases <= t; cases++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
                if (Character.isAlphabetic(s.charAt(i))) sb.append(s.charAt(i));
            String matrix = sb.toString();
            int len = matrix.length();
            int k = (int)Math.sqrt(len);
            if (k * k != len) {
                System.out.println("Case #" + cases +  ":\n" + "No magic :(");
                continue;
            }
            char[][] grid = new char[k][k];
            for (int r = 0; r < k; r++)
                for (int c = 0; c < k; c++)
                    grid[r][c] = matrix.charAt(r * k + c);
            sb = new StringBuilder();
            for (int r = 0; r < k; r++)
                for (int c = 0; c < k; c++)
                    sb.append(grid[r][c]);
            if (!isPalindrome(sb.toString())) {
                System.out.println("Case #" + cases +  ":\n" + "No magic :(");
                continue;
            }
            System.out.println("Case #" + cases +  ":\n" + k);
        }

    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != s.charAt(len - i - 1)) return false;
        return true;
    }
}
