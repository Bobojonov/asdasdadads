package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int l = i + 1;
            int r = array.length - 1;
            while (l < r) {
                int currSum = array[i] + array[l] + array[r];
                if (currSum == targetSum) {
                    Integer[] arr = new Integer[]{array[i], array[l], array[r]};
                    list.add(arr);
                    l++;
                    r--;
                } else if (currSum < targetSum)
                    l++;
                else r--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        System.out.println(threeNumberSum(array, targetSum));
    }
}
