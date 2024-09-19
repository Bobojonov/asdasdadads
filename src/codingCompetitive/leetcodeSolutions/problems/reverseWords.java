package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords {

    public static String reverseWords(String s) {
        s = s.trim();
        List<String> list = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        String s = "  hello   world  ";
        System.out.println(reverseWords(s));
    }
}
