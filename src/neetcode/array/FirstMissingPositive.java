package neetcode.array;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        HashMap<Long, Boolean> map = new HashMap<>();
        for (int num : nums) {
            long x = num;
            if (x < 0) continue;
            map.put(x, true);
            if (!map.containsKey((x + 1))) map.put(x + 1, false);
        }
        long min = 1;
        System.out.println(map);
        for (Map.Entry<Long, Boolean> mp : map.entrySet()) {
            if (!mp.getValue()) {
                System.out.println(mp);
                if (map.containsKey(min) && !map.get(min)) {
                    min = (int)Math.min(min, mp.getKey());
                } else if (!map.containsKey(min)) continue;
                else min = mp.getKey();
                System.out.println(min);
            }
        }
        return (int)min;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,10,2147483647,9};
        System.out.println(firstMissingPositive(nums));
    }
}
