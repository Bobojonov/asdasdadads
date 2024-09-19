package codingCompetitive.leetcodeSolutions.problems;

public class largestNumber {
    public static int dominantIndex(int[] nums) {
        int index = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (i != index && nums[i] * 2 > max)
                return -1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0, 1};
        System.out.println(dominantIndex(nums));
    }

}
