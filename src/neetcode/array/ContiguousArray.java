package neetcode.array;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max_len = 0;
        for (int i = 0; i < nums.length; i++) {
            int ones = 0, zeros = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 1) ones++;
                else zeros++;
                if (zeros == ones) max_len = Math.max(max_len, j - i + 1);
            }
        }
        return max_len;
    }
}
