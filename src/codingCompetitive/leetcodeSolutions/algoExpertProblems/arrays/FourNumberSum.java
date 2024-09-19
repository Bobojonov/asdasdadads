package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> res = new ArrayList<>();
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = array.length - 1; j - i > 2; j--) {
                int l = i + 1;
                int r = j - 1;
                while (l < r) {
                    int sum = array[i] + array[l] + array[r] + array[j];
                    if (sum == targetSum) {
                        res.add(new Integer[] {array[i], array[l++], array[r--], array[j]});
                    }
                    else if (sum < targetSum) l++;
                    else r--;
                }
            }
        }
        return res;
    }
}
