package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) set.remove(nums[i]);
            else set.add(nums[i]);
        }
        if (set.isEmpty()) return -1;
        else return set.iterator().next();

    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(singleNumber(nums));
    }
}
