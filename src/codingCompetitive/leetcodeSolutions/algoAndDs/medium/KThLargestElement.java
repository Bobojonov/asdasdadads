package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

import java.util.PriorityQueue;

public class KThLargestElement {

    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int x: nums)
//            pq.offer(x);
//        while(k --> 1) {
//            pq.poll();
//        }
//        return pq.peek();
        return partition(nums, 0, nums.length - 1, nums.length - k);

    }

    int partition(int[] a, int l, int r, int k) {
        int mid = l + (r - l) / 2;
        int storeIdx = l;
        swap(a, mid, r);
        for (int i = l; i < r; i++) {
            if (a[i] < a[r]) {
                swap(a, i, storeIdx);
                storeIdx++;
            }
        }

        swap(a, storeIdx, r);
        if (storeIdx == k)
            return a[storeIdx];
        else if (k < storeIdx)
            return partition(a, l, storeIdx - 1, k);
        else
            return partition(a, storeIdx + 1, r, k);
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
