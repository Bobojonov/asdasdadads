package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FactorCombinations {

    public static List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        divisors(2, n / 2, new ArrayList<>(), res);
        return res;
    }

    public static void divisors(int i, int n, List<Integer> list, List<List<Integer>> res) {
        if (n < 2) {
            if (list.size() > 1) res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j <= n; j++) {
            if (n % j == 0) {
                list.add(j);
                divisors(j, n / j, list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactors(6));
    }
}
