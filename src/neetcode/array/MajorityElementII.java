package neetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> mp: map.entrySet()) {
            if (mp.getValue() > n) result.add(mp.getKey());
        }
        return result;
    }
}
