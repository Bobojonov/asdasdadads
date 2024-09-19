package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

public class MaximumProduct {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max_product = nums[0];
        int l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l = (l == 0 ? 1 : l) * nums[i];
            r = (r == 0 ? 1 : r) * nums[n - 1 - i];
            max_product = Math.max(max_product, Math.max(l, r));
        }
        return max_product;
    }
}
