package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class threeSum {


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int sum = -nums[j] - nums[i];
                System.out.println(sum);
                if (map.containsKey(sum)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], sum);
                    Collections.sort(list);
                    set.add(list);
                }
                map.put(nums[j], i);
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        System.out.println(threeSum(nums));
    }
}
