package codingCompetitive.leetcodeSolutions.problems;

public class maximumScorefromPerformingMultiplicationOperations {
    public static int maximumScore(int[] nums, int[] multipliers){
        return dfs(0, nums.length - 1, 0, nums, multipliers);
    }
    public static int dfs(int l, int r, int i, int[] nums, int[] multipliers){
        if (i == multipliers.length) return 0;
        return Math.max(nums[l] * multipliers[i] + dfs(l + 1, r, i + 1, nums, multipliers),
                nums[r] * multipliers[i] + dfs(l ,r - 1, i + 1, nums, multipliers));
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] multipliers = {3, 2, 1};
        System.out.println(maximumScore(nums, multipliers));
    }
}
