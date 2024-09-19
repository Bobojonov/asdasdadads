package neetcode.slidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsMakeArrayContinuous {
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i] - nums[i - 1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        System.out.println(map);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {1,2,3,5,6}));
    }
}
