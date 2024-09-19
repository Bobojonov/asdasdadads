package codingCompetitive.leetcodeSolutions.problems;

public class findNumbersOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i ++){
            if ((String.valueOf(nums[i]).length() & 1) == 0) count += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
