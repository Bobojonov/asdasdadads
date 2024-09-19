package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0, j = sequence.size() - 1;
        int l = 0, r = array.size() - 1;
        int cnt = 0;
        while (l < r) {
            if (array.get(l) == sequence.get(i)) {
                i++;
                cnt++;
                if (cnt == sequence.size()) return true;
            }
            if (array.get(r) == sequence.get(j)){
                j--;
                cnt++;
                if (cnt == sequence.size()) return true;
            }
            l++;
            r--;
        }
        return false;
    }
}
