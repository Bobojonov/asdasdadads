package codingCompetitive.leetcodeSolutions.problems;

public class BeautifulArrangement {
    public int countArrangement(int n) {
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++)
            nums[i - 1] = i;

        return 1;
    }  

    public void swap(int[] nums, int x, int y) {
        int tmp = nums[y];
        nums[y] = nums[x];
        nums[x] = tmp;
    }
}
