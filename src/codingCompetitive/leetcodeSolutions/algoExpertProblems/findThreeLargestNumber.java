package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class findThreeLargestNumber {
    public static int[] findThreeLargestNumbers(int[] array) {
        Arrays.sort(array);
        int len = array.length;
        if (len < 2) return null;
        else return new int[]{array[len - 3], array[len - 2], array[len - 1]};
    }
    public static void main(String[] args) {

    }
}
