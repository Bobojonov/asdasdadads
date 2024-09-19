package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num: nums) {
            List<List<Integer>> subset = new ArrayList();
            for (List<Integer> set: result){
                subset.add(new ArrayList<>(set){{add(num);}});
            }
            for (List<Integer> set: subset){
                result.add(set);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

}
