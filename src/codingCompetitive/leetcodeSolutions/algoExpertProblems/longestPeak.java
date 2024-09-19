package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class longestPeak {

    public static int longestPeak(int[] array) {
        int[] left = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i])
                left[i] = left[i - 1] + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();

        int[] right = new int[array.length];
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i + 1] < array[i])
                right[i] = right[i + 1] + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (left[i] != 0 && right[i] != 0)
                max = Math.max(left[i] + right[i] + 1, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));
    }
}
