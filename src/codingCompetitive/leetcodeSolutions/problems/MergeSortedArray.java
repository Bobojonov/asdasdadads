package codingCompetitive.leetcodeSolutions.problems;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++)
            nums1[i] = nums2[i];
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2, 5, 6};
        int n = 3;
    }

}
