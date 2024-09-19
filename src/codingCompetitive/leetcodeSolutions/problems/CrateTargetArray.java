package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class CrateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++)
            ls.add(index[i], nums[i]);
        int[] target = new int[n];
        for (int i = 0; i < n; i++)
            target[i] = ls.get(i);
        return target;
    }
}
