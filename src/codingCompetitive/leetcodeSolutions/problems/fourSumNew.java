package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class fourSumNew {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> quadruplets = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;
        Map< Integer, Set<List<Integer>> > sums = new HashMap<>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                sums.computeIfAbsent(nums[i] + nums[j], k -> new HashSet<>()).add(Arrays.asList(i, j));
            }
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = target - (nums[i] + nums[j]);
                if (sums.containsKey(sum)) {
                    for (List<Integer> list: sums.get(sum)) {
                        if (list.get(0) > j && list.get(1) > j) {
                            List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[list.get(0)], nums[list.get(1)]);
                            Collections.sort(quad);
                            quadruplets.add(quad);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(quadruplets);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int target = 8;
        System.out.println(fourSum(nums, target));


    }

}
