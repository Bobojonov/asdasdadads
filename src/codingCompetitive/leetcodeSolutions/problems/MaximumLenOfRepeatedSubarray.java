package codingCompetitive.leetcodeSolutions.problems;

public class MaximumLenOfRepeatedSubarray {

    public static int findLength(int[] nums1, int[] nums2) {
        int maxLen = 0;
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j])
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                if (maxLen < dp[i][j]) maxLen = dp[i][j];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        System.out.println(findLength(nums1, nums2));
    }
}
