package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] a) {
        if (a.length == 0) return 0;
        int max = 1;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = 1;
        for (int i = 0; i < a.length; i++) {
            int curr = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] > a[j])
                    curr = Math.max(curr, b[j]);
            }
            b[i] += curr;
            max = Math.max(max, b[i]);
        }
        return max;
    }
}
