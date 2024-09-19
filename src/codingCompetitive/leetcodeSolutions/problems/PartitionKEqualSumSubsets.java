package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class PartitionKEqualSumSubsets {

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int n = nums.length;
        if (n < k) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        System.out.println(sum);
        if (sum % k != 0) return false;
        int subsets = sum / k;
        while (subsets >= 1) {
            boolean[] dp = new boolean[subsets + 1];
            dp[0] = true;
            for (int num : nums) {
                for (int j = subsets; j >= num; j--)
                    dp[j] |= dp[j - num];
            }
            boolean f = true;
            for (int i = 0; i <= subsets; i++) {
                if (!dp[i]) {
                    f = false;
                    break;
                }
            }
            System.out.println(subsets);
            System.out.println(Arrays.toString(dp));
            if (f) return true;
            subsets--;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4,4,6,2,3,8,10,2,10,7};
        int k = 4;
        System.out.println(canPartitionKSubsets(nums, k));
    }
}
