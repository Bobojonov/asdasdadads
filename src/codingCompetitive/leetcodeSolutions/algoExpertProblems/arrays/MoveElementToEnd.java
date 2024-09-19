package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int l = 0, r = array.size() - 1;
        while (l < r) {
            int right = array.get(r);
            int left  = array.get(l);
            if (right != toMove) {
                if (left == toMove) {
                    array.set(l, right);
                    array.set(r, left);
                    l++;
                    r--;
                } else l++;
            } else r--;
        }
        return array;
    }
}
