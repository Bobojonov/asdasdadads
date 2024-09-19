package codingCompetitive.leetcodeSolutions.problems;

public class maxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = Integer.MIN_VALUE;
        int ones = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) ones = ones + 1;
            else {
                max = Math.max(max, ones);
                ones = 0;
            }
        }
        return Math.max(max, ones);
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
