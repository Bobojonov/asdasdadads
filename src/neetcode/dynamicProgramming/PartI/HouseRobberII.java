package neetcode.dynamicProgramming.PartI;

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        return Math.max(nums[0],
                Math.max(
                        helper(Arrays.copyOfRange(nums, 1, nums.length)),
                        helper(Arrays.copyOfRange(nums, 0, nums.length - 1))
                )
        );
    }

    public int helper(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
