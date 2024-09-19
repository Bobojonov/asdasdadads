package neetcode.array;

public class SumOfAbsoluteDifferenceSortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[0] += num - nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] +(nums[i] - nums[i - 1]) * i - (nums[i] - nums[i - 1]) * (nums.length - i);  
        }
        return arr;
    }
}
