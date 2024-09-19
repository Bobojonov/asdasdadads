package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backSpaceCompare(s, t));
    }

    public static boolean backSpaceCompare(String s, String t) {
        List<Character> list = new ArrayList<>();
        list.remove(list.size() - 1);
        System.out.println(list);
        return true;
    }
}
