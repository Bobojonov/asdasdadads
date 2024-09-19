package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashSet;
import java.util.Set;

public class firstDuplicateValue {

    public int firstDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int x: array){
            if (set.contains(x)) return x;
            else set.add(x);
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
