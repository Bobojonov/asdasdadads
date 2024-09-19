package codingCompetitive.leetcodeSolutions.problems;

public class minimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = 0, sum = 0, len = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
                len = Math.min(len, j - i);
                sum -= nums[i++];
            }
        }
        return len == Integer.MIN_VALUE ? 0 : len;
    }
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
}
