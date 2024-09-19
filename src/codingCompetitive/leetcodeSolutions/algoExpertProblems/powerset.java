package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.List;

public class powerset {

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        helper(array, new ArrayList<>(), 0, perms);
        return perms;
    }

    public static void helper(List<Integer> array, List<Integer> perm, int idx, List<List<Integer>> perms) {
        perms.add(new ArrayList<>(perm));
        if (perm.size() == array.size()) return;
        for (int i = idx; i < array.size(); i++) {
            perm.add(array.get(i));
            helper(array, perm, i + 1, perms);
            System.out.println(perm);
            perm.remove(perm.size() - 1);
        }
    }

}
