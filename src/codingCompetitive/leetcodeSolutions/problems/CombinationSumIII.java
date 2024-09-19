package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combinations(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    
    public static void combinations(List<List<Integer>> res, List<Integer> comb, int k, int n, int start) {
        if (comb.size() == k && n == 0) {
            List<Integer> list = new ArrayList<>(comb);
            res.add(list);
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            combinations(res, comb, k, n - i,i + 1);
            comb.remove(comb.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(2, 18));
    }
}
