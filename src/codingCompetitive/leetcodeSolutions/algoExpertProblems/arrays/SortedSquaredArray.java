package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int[] arr = new int[array.length];
        int l = 0, r = arr.length;
        for (int i = arr.length; i >= 0; i--) {
            int left_value  = array[l];
            int right_value = array[r];
            if (Math.abs(left_value) <= Math.abs(right_value)) {
                arr[i] = right_value * right_value;
                r--;
            } else {
                arr[i] = left_value * left_value;
                l++;
            }
        }
        return arr;
    }
}
