package codingCompetitive.leetcodeSolutions.problems;

public class MaximumSubarraySumCircular {

    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0, currMin = 0, total = 0, maxSum = nums[0], minSum = nums[0];
        for (int n: nums) {
            currMax = Math.max(currMax, 0) + n;
            maxSum  = Math.max(maxSum, currMax);
            currMin = Math.min(currMin, 0) + n;
            minSum  = Math.min(minSum, currMin);
            total += n;
        }
        return minSum == total ? maxSum : Math.max(maxSum, total - minSum);
    }
}
