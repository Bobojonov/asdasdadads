package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zigzagTraverse {

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int maxCoord = array.size() - 1 + array.get(0).size() - 1;
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= maxCoord; i++) {
            int coord[] = new int[] {0, 1};
            List<Integer> res = new ArrayList<>();
            while (coord[0] < array.size() && coord[1] >= 0) {
                if (coord[0] >= 0 && coord[1] < array.get(0).size()) {
                    res.add(array.get(coord[0]).get(coord[1]));
                }
                coord[0]++;
                coord[1]--;
            }
            if (res.size() == 0) continue;
            if (i % 2 == 1) Collections.reverse(res);
            result.addAll(res);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
