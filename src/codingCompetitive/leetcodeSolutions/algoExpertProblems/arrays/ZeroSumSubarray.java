package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {
    public boolean zeroSumSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int n: nums) {
            sum += n;
            if (!set.add(sum) || sum == 0 || n == 0) return true;
        }
        return false;
    }
}
