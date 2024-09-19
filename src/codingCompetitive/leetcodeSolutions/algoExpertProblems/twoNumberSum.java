package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashSet;

public class twoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int x: array) {
            if (set.contains(targetSum - x)) return new int[]{targetSum - x, x};
            else set.add(x);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(twoNumberSum(array, targetSum));
    }
}
