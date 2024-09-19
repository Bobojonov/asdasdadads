package neetcode.twoPointers;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfK {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = k - 1; i < nums.length; i++) {
            result = Math.min(result, nums[i] - nums[i - k + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {87063,61094,44530,21297,95857,93551,9918};
        System.out.println(minimumDifference(nums, 6));
    }
}
