package codingCompetitive.leetcodeSolutions.leetcode.array;

public class SumOfAllSubsetXORTotals {
    public static int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        for (int subset = 0; subset < (1 << n); subset++) {
            int subsetXor = 0;
            for (int i = 0; i < n; i++) {
                if ((subset & (1 << i)) != 0)
                    subsetXor ^= nums[i];
            }
            totalXor += subsetXor;
        }
        return totalXor;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(subsetXORSum(nums));
    }
}
