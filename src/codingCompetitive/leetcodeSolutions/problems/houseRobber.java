package codingCompetitive.leetcodeSolutions.problems;

public class houseRobber {
    public static int rob(int[] nums){
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
         int[] dp = new int[nums.length];
         dp[0] = nums[0];
         dp[1] = Math.max(nums[0], nums[1]);
         for (int i = 2; i < nums.length; i++)
             dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
         return dp[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }
}
/*
0 1
3
 */