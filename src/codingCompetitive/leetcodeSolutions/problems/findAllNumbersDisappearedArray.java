package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findAllNumbersDisappearedArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        Set<Integer> numSet = new HashSet<Integer>();
        for (int x: nums) numSet.add(x);
        for (int i = 1; i <= nums.length; i++){
            if (!numSet.contains(i)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
