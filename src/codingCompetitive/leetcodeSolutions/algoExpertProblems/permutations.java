package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.List;

public class permutations {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        if (array.size() == 0) return new ArrayList<List<Integer>>();
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        helper(array, 0, perms);
        return perms;
    }

    public static void helper(List <Integer> array, int idx, List<List<Integer>> perms) {
        if (idx == array.size() - 1) {
            List<Integer> perm = new ArrayList<>(array);
            perms.add(perm);
        }
        else {
            for (int i = idx; i < array.size(); i++){
                swap(array, idx, i);
                helper(array, idx + 1, perms);
                swap(array, idx, i);
            }
        }
        return;
    }
    public static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
        return;
    }

    public static void main(String[] args) {

    }
}
