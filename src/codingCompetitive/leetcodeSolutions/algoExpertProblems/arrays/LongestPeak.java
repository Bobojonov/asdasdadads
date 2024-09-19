package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;

public class LongestPeak {

    public static int longestPeak(int[] array) {
        int[] inc = new int[array.length];
        for (int i = 1; i < array.length; i++)
            if (array[i] > array[i - 1])
                inc[i] = inc[i - 1] + 1;
        int[] dec = new int[array.length];
        for (int i = array.length - 2; i >= 0; i--)
            if (array[i + 1] < array[i])
                dec[i] = dec[i + 1] + 1;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (inc[i] != 0 && dec[i] != 0)
                res = Math.max(inc[i] + dec[i] + 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPeak(new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }
}
