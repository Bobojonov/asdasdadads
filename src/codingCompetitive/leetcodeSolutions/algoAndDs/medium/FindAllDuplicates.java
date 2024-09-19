package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0)
                list.add(idx + 1);
            nums[idx] *= -1;
        }
        return list;
    }
}
