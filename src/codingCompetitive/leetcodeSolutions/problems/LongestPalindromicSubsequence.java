package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed.compareTo(s));
        System.out.println(reversed);
        int n = s.length();
        char[] charArray2 = {'a', 'c'};
        char[] charArray1 = {'a', 'c'};
        System.out.println(Arrays.equals(charArray2, charArray1));
        int[][] dp = new int[n + 1][n + 1];
        System.out.println(dp);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == reversed.charAt(j))
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("bbbab"));
    }
}
