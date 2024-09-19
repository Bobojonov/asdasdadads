package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicatesII {

    public boolean containsNearByDuplicates(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - l <= k) {
                if (!st.add(nums[i])) return true;
            }
            if (i - l == k) {
                st.remove(nums[l]);
                l++;
            }
        }
        return false;
    }

}
