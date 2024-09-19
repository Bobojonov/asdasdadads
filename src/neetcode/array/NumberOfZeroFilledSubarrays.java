package neetcode.array;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        int result = 0, idx = 0;
        for (int n: nums) {
            if (n == 0) {
                result += ++idx;
            } else idx = 0;
        }
        return result;
    }
}
