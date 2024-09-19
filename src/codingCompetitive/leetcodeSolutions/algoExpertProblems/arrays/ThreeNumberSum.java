package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> res = new ArrayList<>();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 2; i++) {
            int l = i + 1;
            int r = array.length - 1;
            while (l < r) {
                int sum = array[i] + array[l] + array[r];
                if (sum == targetSum) {
                    res.add(new Integer[] {array[i], array[l], array[r]});
                    l++;
                    r--;
                }
                else if (sum < targetSum) l++;
                else r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        int sum = 0;
        System.out.println(threeNumberSum(arr, sum));
    }
}
