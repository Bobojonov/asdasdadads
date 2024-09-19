package neetcode.dynamicProgramming;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int l = 0, r = 0, cnt = 0;
        while (r < n) {
            
        }
        return arr;
    }
}
