package neetcode.slidingWindow;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k - 1) {
                int max = -1000;
                int j = i;
                while (j >= start) {
                    max = Math.max(nums[j], max);
                    j--;
                }
                res[start] = max;
                start++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,0,4,2,6};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
}
