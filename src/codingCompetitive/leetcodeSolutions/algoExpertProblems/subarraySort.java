package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class subarraySort {

    public static int[] subarraySort(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (isOutOfOrder(i, num, array)) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        if (min == Integer.MAX_VALUE)
            return new int[] {-1, -1};
        int leftIndex = 0;
        while (min >= array[leftIndex]) {
            leftIndex++;
        }
        int rightIndex = array.length - 1;
        while (max <= array[rightIndex]) {
            rightIndex--;
        }
        return new int[] {leftIndex, rightIndex};
    }
    public static boolean isOutOfOrder(int i, int num, int[] array) {
        if (i == 0) return num > array[i + 1];
        if (i == array.length - 1) return num < array[i - 1];
        return num > array[i + 1] || num < array[i - 1];
    }

    public static void main(String[] args) {

    }
}
