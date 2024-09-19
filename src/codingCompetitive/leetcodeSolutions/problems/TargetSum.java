package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public static int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> map = new HashMap<>();
        int res = combinations(0, nums, target, map);
        return res;
    }
    
    public static int combinations(int index, int[] nums, int target, Map<String, Integer> map) {
        System.out.println(map);
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }
        String key = index + "," + target;
        if (map.containsKey(key))
            return map.get(key);
        int add = combinations(index + 1, nums, target + nums[index], map);
        int subtract = combinations(index + 1, nums, target - nums[index], map);
        map.put(key, add + subtract);
        return add + subtract;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int target = 3;
        findTargetSumWays(nums, target);
    }
}
