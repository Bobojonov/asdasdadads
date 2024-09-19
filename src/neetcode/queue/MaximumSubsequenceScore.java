package neetcode.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int len = nums1.length;
        int[][] arr = new int[len][2];
        for (int i = 0; i < nums1.length; i++) arr[i] = new int[]{nums2[i], nums1[i]};
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        System.out.println(Arrays.deepToString(arr));
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        long res = 0, sum = 0;
        for (int[] num: arr) {
            pq.add(num[1]);
            sum = sum + num[1];
            if (pq.size() > k) sum -= pq.poll();
            if (pq.size() == k) res = Math.max(res, sum * num[0]); 
        }
        return res;
    }
}
