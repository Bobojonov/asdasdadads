package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class missingNumber {
    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int x: nums) numSet.add(x);
        for (int i = 0; i < nums.length + 1; i++){
            if (!numSet.contains(i))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
//        System.out.println(4 ^ 0);
        System.out.println(missingNumber(nums));
    }
}
