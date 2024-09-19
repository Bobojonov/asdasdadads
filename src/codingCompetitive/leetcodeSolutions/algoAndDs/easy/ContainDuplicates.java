package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int x: nums) {
            if (st.contains(x)) return true;
            st.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] x = {1,5,-2,-4,0};
        System.out.println(containsDuplicate(x));
    }
}
