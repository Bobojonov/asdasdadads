package neetcode.dynamicProgramming;

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int l = 0, r = height.length - 1, result = 0;
        int left_height = height[l], right_height = height[r];
        while (l < r) {
            if (left_height < right_height) {
                l++;
                left_height = Math.max(left_height, height[l]);
                result += left_height - height[l];
            } else {
                r--;
                right_height = Math.max(right_height, height[r]);
                result += right_height - height[r];
            }
        }
        return result;
    }
}
