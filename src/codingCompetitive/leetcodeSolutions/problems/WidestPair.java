package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.Map;

public class WidestPair {

    public int widestPairOfIndices(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int max = 100000;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, res = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums1[i] - nums2[i];
            res = Math.max(res, i - map.getOrDefault(sum, max));
            map.put(sum, map.getOrDefault(sum, i));
        }
        return res;
    }
}
