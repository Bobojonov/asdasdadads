package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class smallestDifferences {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[] {arrayOne[0], arrayTwo[0]};
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idx1 = 0;
        int idx2 = 0;
        int smallest = Integer.MAX_VALUE;
        while (idx1 < arrayOne.length && idx2 < arrayTwo.length) {
            int val1 = arrayOne[idx1];
            int val2 = arrayTwo[idx2];
            int difference = Math.abs(val1 - val2);
            if (difference < smallest) {
                smallest = difference;
                result = new int[]{val1, val2};
            }
            if (val1 < val2) idx1++;
            else idx2++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
