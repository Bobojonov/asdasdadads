package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class stringPermutation {

    public static void main(String[] args) {
        String s = "carerac";
        System.out.println(canPermutePalindrome(s));

    }
    public static boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet< >();
        for (int i = 0; i < s.length(); i++){
            System.out.println(set);
            if (!set.add(s.charAt(i)))
                set.remove(s.charAt(i));
            System.out.println(set);
        }
        return set.size() <= 1;
    }
}
