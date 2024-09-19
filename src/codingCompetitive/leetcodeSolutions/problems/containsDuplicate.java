package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i: nums){
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++){
//            if (nums[i] == nums[i + 1]) return true;
//        }
//        return false;


    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
