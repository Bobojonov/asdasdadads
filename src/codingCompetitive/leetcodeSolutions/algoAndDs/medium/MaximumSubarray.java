package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max_sum = Math.max(curr, max_sum);
            if (curr < 0) curr = 0;
        }
        return max_sum;
    }
}
