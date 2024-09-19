package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < n; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
