package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int res = 0;
        for (int k: map.keySet()) {
            if (map.containsKey(k + 1))
                res = Math.max(res, map.get(k) + map.get(k + 1));
        }
        return res;
    }
}
