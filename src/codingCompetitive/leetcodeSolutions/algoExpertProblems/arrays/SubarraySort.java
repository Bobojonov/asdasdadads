package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;

public class SubarraySort {

    public static int[] subarraySort(int[] array) {
        int[] sorted = array.clone();
        Arrays.sort(sorted);
        int l = -1, r = -1;
        int idx = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != sorted[i] && l == -1)
                l = i;
            if (array[idx - i] != sorted[idx - i] && r == -1)
                r = idx - i;
        }
        return new int[]{l, r};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        System.out.println(Arrays.toString(subarraySort(arr)));
    }
}
