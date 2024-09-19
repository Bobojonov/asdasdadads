package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int l = 0; int i = 0;
        while (i < n) {
            result[l] = nums[i];
            result[l + 1] = nums[n + i];
            System.out.println(Arrays.toString(result));
            i++;
            l += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
