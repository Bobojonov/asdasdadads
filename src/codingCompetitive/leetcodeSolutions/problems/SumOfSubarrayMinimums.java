package codingCompetitive.leetcodeSolutions.problems;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfSubarrayMinimums {

    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        int mod = (int) 1e9 + 7, n = arr.length;
        Deque<Integer> st = new LinkedList<>();
        for (int i = -1; i <= n; i++) {
            while (!st.isEmpty() && get(arr,st.peek(),n) > get(arr, i, n)) {
                int idx = st.pop();
                int l = st.peek(), r = i;
                sum = (sum + (long)(idx - l) * (r - idx) * arr[idx]) % mod;
            }
            st.push(i);
        }
        return (int) sum;
    }
    public int get(int[] arr, int i, int n) {
        return (i == -1 || i == n) ? Integer.MIN_VALUE : arr[i];
    }
}
