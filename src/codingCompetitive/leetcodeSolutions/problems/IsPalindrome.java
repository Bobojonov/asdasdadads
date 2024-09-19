package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        while(l < r) {
            System.out.println(l + " " + r);
            if (!Character.isLetterOrDigit(s.charAt(l))) l++;
            if (!Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))) {
                if (!String.valueOf(s.charAt(l)).equalsIgnoreCase(String.valueOf(s.charAt(r)))) return false;
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
    }
}
