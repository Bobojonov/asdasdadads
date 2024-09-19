package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class levenshteinDistance {

    public static int levenshteinDistance(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i < dp.length; i++)
            dp[i][0] = i;
        for (int i = 0; i < dp[0].length; i++)
            dp[0][i] = i;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "yabd";
        System.out.println(levenshteinDistance(str1, str2));

    }
    // 1 + (1, 0,
}
