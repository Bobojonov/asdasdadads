package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int x: array) {
            if (set.contains(targetSum - x)) return new int[]{targetSum - x, x};
            set.add(x);
        }
        return new int[] {};

    }
}
