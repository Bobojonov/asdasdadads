package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        if (array == null || array.length == 1) return true;
        int sign = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (sign == 0) {
                if (array[i] < array[i + 1]) sign = 1;
                else if (array[i] > array[i + 1]) sign = -1;
            }
            if (sign == 1 && array[i] > array[i + 1]) return false;
            if (sign == -1 && array[i] < array[i + 1]) return false;
        }
        return true;
    }
}
