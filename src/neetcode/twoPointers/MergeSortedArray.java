package neetcode.twoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m + n; i++) {
            if (i >= m) nums1[i] = nums2[i - n];
        }
        Arrays.sort(nums1);
    }
}
