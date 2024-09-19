package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int l = 0, r = 0, max = Integer.MAX_VALUE;
        int[] res = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        while (l < arrayOne.length && r < arrayTwo.length) {
            int diff = Math.abs(arrayOne[l] - arrayTwo[r]);
            if (max > diff) {
                max = diff;
                res[0] = arrayOne[l];
                res[1] = arrayOne[r];
            }
            if (arrayOne[l] < arrayTwo[r]) l++;
            else r++;
        }
        return res;
    }
}
