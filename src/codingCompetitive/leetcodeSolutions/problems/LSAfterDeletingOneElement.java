package codingCompetitive.leetcodeSolutions.problems;

public class LSAfterDeletingOneElement {

    public static int longestSubarray(int[] nums) {
        int l = 0, r, cnt = 1;
        for (r = 0; r < nums.length; r++) {
            if (nums[r] == 0) cnt--;
            if (cnt < 0 && nums[l++] == 0) cnt++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0, 0,1};
        System.out.println(longestSubarray(nums));
    }
}
