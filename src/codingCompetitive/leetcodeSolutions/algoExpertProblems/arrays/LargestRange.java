package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        Set<Integer> set = new HashSet<>();
        int[] res = {array[0], array[0]};
        for (int x: array) set.add(x);
        for (int x: array) {
            if (set.contains(x)) {
                int l = x;
                int r = x;
                while (set.contains(l - 1)) l -= 1;
                while (set.contains(r + 1)) r += 1;
                if (r - l > res[1] - res[0]) {
                    res[0] = l;
                    res[1] = r;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6})));
    }
}
