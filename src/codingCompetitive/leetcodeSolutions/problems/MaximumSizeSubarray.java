package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class MaximumSizeSubarray {
    public int maxSubArrayLen(int[] nums, int k) {
        int max = 0;
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            prefix += nums[i];
            if (prefix == k) max = i + 1;
            if (map.containsKey(prefix - k)) {
                max = Math.max(max, i - map.get(prefix - k));
            }
            if (!map.containsKey(prefix)) {
                map.put(prefix, i);
            }
        }
        return max;
    }
}
