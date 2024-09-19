package neetcode.array;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(Map.of(0, 0));
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (!map.containsKey(prefix % k))
                map.put(prefix % k, i + 1);
            else if (map.get(prefix % k) < i) return true;
        }
        return false;
    }
}
