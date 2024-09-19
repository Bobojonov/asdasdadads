package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumIncrementMakeArrayUnique {

    public static int minIncrementForUnique(int[] nums) {
        int n = 0;
        for (int x: nums)
            n = Math.max(x, n);
        int[] arr = new int[nums.length + n];
        for (int x: nums)
            arr[x]++;
        int cnt = 0;
        for (int i = 0; i < nums.length + n; i++) {
            if (arr[i] > 1) {
                int x = i;
                while (arr[i] > 1) {
                    cnt++;
                    x += 1;
                    if (arr[x] == 0) {
                        arr[x] = 1;
                        x = i;
                        arr[i]-= 1;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,1};
        System.out.println(minIncrementForUnique(nums));
    }
}
