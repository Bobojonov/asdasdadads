package codingCompetitive.leetcodeSolutions.algoExpertProblems.dynamicProgramming;

public class MaxSubsetSumAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int[] dp = new int[array.length];
        dp[0] = array[0];
        dp[1] = Math.max(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            dp[2] = Math.max(array[i] + dp[0], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[1];
    }
}
