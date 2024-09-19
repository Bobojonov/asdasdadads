package neetcode.slidingWindow;

import java.util.Arrays;

public class FrequencyMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, sum = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            sum += x;
            while ((i - l + 1) * x - sum > k) {
                sum -= nums[l];
                l++;
            }
            res = Math.max(i - l + 1, res);
        }
        return res;
    }
}
