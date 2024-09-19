package codingCompetitive.leetcodeSolutions.dynamicProgramming;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStair(cost));
    }

    public static int minCostClimbingStair(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i < dp.length; i++)
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        return dp[dp.length - 1];
    }
}
