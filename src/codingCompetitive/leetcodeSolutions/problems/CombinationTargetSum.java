package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class CombinationTargetSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combination(0, target, nums, new ArrayList<>(), res);
        return res;
    }
    
    public void combination(int i, int target, int[] nums, List<Integer> comb, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(comb));
        } else if (target < 0 || i >= nums.length) return;
        else {
            comb.add(nums[i]);
            combination(i, target - nums[i], nums, comb, res);
            comb.remove(comb.get(comb.size() - 1));
            combination(i + 1, target, nums, comb, res);
        }
    } 
}
