package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.List;

public class moveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int cnt = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != toMove)
                array.set(cnt++, array.get(i));
        }
        while (cnt < array.size()) {
            array.set(cnt++, toMove);
        }
        return array;
    }

}
