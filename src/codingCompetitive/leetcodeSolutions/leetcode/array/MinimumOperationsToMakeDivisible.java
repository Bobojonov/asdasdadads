package codingCompetitive.leetcodeSolutions.leetcode.array;

public class MinimumOperationsToMakeDivisible {

    public static int minimumOperations(int[] nums) {
        int count = 0;
//        for (int num : nums) {
//            count += Math.abs(num - findClosestDivisibleByThree(num));
//        }
//        return count;
        // second solution
        for (int i = 0; i < nums.length; i++) {
            int remainder = nums[i] % 3;
            if (remainder != 0) {
                int adjustment = Math.min(remainder, 3 - remainder);
                count += adjustment;
                nums[i] += (remainder == 1) ? -1 : 1; // Adjust in-place if allowed
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        System.out.println(minimumOperations(nums));
    }
    
    public static int findClosestDivisibleByThree(int num) {
        if (num % 3 == 0) return num;
        int lower = num - (num % 3);
        int higher = lower + 3;
        if (num - lower < higher - num)
            return lower;
        else return higher;
    }
}
