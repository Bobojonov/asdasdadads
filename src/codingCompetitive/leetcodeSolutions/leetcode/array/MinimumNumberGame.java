package codingCompetitive.leetcodeSolutions.leetcode.array;

import static java.util.Arrays.sort;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        sort(nums);
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i += 2) {
            res[i] = nums[i + 1];
            res[i + 1] = nums[i];
        }
        return res;
    }
}
