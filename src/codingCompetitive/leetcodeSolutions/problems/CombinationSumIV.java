package codingCompetitive.leetcodeSolutions.problems;

public class CombinationSumIV {
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int x: nums) {
                if (i >= x)
                    dp[i] += dp[i - x];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }
}
