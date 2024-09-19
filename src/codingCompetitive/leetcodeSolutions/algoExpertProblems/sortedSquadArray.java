package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class sortedSquadArray {
    public static int[] sortedSquaredArray(int[] array) {
        int[] res = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i <= array.length - 1; i++) {
            int left_value = array[left];
            int right_value = array[right];
            if (Math.abs(left_value) <= Math.abs(right_value)) {
                res[i] = left_value * left_value;
                left++;
            } else {
                res[i] = right_value * right_value;
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(sortedSquaredArray(array));
    }
}
