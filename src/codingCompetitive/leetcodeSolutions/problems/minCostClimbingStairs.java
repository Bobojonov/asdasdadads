package codingCompetitive.leetcodeSolutions.problems;

public class minCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i <= cost.length; i++){
            int oneStep = dp[i - 1] + cost[i - 1];
            int twoStep = dp[i - 2] + cost[i - 2];
            dp[i] = Math.min(oneStep, twoStep);
        }
        return dp[cost.length];

    }
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
