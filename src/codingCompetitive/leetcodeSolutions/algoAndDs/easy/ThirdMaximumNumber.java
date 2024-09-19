package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (len < 3) return nums[len - 1];
        int res = nums[len - 1];
        int cnt = 1;
        for (int i = len - 1; i > 0; i--) {
            if (cnt == 3) break;
            if (nums[i] != nums[i - 1]) {
                res = nums[i - 1];
                cnt++;
            }
        }
        if (cnt < 3) return nums[len - 1];
        else return res;
    }
}
