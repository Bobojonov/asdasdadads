package codingCompetitive.leetcodeSolutions.problems;




public class findPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;
        for (int i: nums) sum += i;
        for (int i = 0; i < nums.length; i++){
            if (left_sum == sum - left_sum - nums[i]) return i;
            else left_sum = left_sum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
