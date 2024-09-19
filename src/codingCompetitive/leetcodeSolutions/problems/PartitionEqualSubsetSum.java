package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {
        if (nums.length == 0) return false;
        int sum = 0;
        for (int num: nums) sum += num;
        if (sum % 2 != 0) return false;
        int subset = sum / 2;
        boolean[] dp = new boolean[subset + 1];
        dp[0] = true;
        for (int num: nums) {
            for (int j = subset; j >= num; j--)
                dp[j] |= dp[j - num];
            System.out.println(Arrays.toString(dp));
        }
        return dp[subset];
    }

    public static void main(String[] args) {
        int[] nums = {1,5, 5, 11};
        System.out.println(canPartition(nums));
    }
}
