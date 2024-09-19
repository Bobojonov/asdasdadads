package codingCompetitive.leetcodeSolutions.dynamicProgramming;

import java.util.Arrays;

public class isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int[] dp = new int[s.length() + 1];
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = curr; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1] = dp[i] + 1;
                    curr = j + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()] == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("aaaaaa","bbaaaa"));
    }
}
