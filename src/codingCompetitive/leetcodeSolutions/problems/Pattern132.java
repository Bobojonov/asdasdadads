package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Pattern132 {

    public boolean find132Pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        int[] min = new int[n];
        min[0] = nums[0];
        for (int i = 1; i < n; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        for (int j = nums.length - 1, k = nums.length; j >= 0; j--) {
            if (nums[j] > min[j]) {
                k = Arrays.binarySearch(nums, k, nums.length, min[j] + 1);
                if (k < 0)
                    k = -1 - k;
                if (k < nums.length && nums[k] < nums[j])
                    return true;
                nums[--k] = nums[j];
            }
        }
        return false;
    }
}
