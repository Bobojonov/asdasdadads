package codingCompetitive.leetcodeSolutions.algoAndDs.hard;

import java.util.Set;

public class ContainsDuplicatesIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != l && i - l <= indexDiff) {
                System.out.println(l + " " + i);
                if (find(nums, l, i, valueDiff)) return true;
            }
            if (i - l == indexDiff)
                l++;
        }
        return false;
    }

    public static boolean find(int[] nums, int l, int r, int value) {
        for (int i = l; i < r; i++) {
            System.out.println("asdada" + " " + i + " " + r);
            if (Math.abs(nums[r] - nums[i]) <= value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,9,1,5,9};
        System.out.println(containsNearbyAlmostDuplicate(nums, 2, 3));
    }
}
