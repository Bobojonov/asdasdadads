package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

    public int firstDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int x: array){
            if (set.contains(x)) return x;
            else set.add(x);
        }
        return -1;
    }
}
