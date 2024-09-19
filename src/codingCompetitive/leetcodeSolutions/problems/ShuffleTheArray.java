package codingCompetitive.leetcodeSolutions.problems;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[2 * n];
        int j = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            a[j] = nums[i];
            a[j + 1] = nums[n];
            n++;
            j += 2;
        }
        return a;
    }
}
