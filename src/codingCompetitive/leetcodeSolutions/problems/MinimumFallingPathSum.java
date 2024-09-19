package codingCompetitive.leetcodeSolutions.problems;

public class MinimumFallingPathSum {

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n + 2];
        for (int i = 1; i <= n; i++)
            dp[0][i] = matrix[0][i - 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][n + 1] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                min = Math.min(min, dp[i - 1][j + 1]);
                dp[i][j] = matrix[i][j - 1] + min;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
            min = Math.min(min, dp[n - 1][i]);
        return min;
    }
}
