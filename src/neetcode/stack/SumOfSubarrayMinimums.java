package neetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumOfSubarrayMinimums {
    public static int sumSubarrayMins(int[] arr) {
        int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left, -1);
        Arrays.fill(right, len);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            System.out.println(dq);
            while (!dq.isEmpty() && arr[dq.peekFirst()] >= arr[i]) dq.pollFirst();
            if (!dq.isEmpty()) left[i] = dq.peekFirst();
            dq.push(arr[i]);
            
        }
        System.out.println(dq);
        dq.clear();
        for (int i = len - 1; i >= 0; i--) {
            while (!dq.isEmpty() && arr[dq.peekFirst()] >= arr[i]) dq.pollFirst();
            if (!dq.isEmpty()) right[i] = dq.peekFirst();
            dq.push(arr[i]);
        }
        int mod = (int) (1e9 + 7);
        long res = 0;
        for (int i = 0; i < len; i++) {
            res += (long)(i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            res %= mod;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{3,1,2,4}));;
    }
}
