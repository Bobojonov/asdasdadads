package codingCompetitive.leetcodeSolutions.problems;

public class MaximumAlternatingSubarraySum {

    public long maximumAlternatingSubarraySum(int[] nums) {
        long minus = Integer.MIN_VALUE;
        long plus  = Integer.MIN_VALUE;
        long res   = Integer.MIN_VALUE;
        for (int num: nums) {
            long sum = Math.max(minus + num, num);
            minus = plus - num;
            plus  = sum;
            res = Math.max(res, Math.max(minus, plus));
        }
        return res;
    }
}
