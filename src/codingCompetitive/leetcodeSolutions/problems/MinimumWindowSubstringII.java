package codingCompetitive.leetcodeSolutions.problems;

import org.w3c.dom.css.CSSPrimitiveValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumWindowSubstringII {
    public static String minWindow(String s, String t) {
        String result = "";
        Map<Character, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.contains(String.valueOf(c))) {
                if (map.containsKey(c)) {
                    map.get(c).add(i);
                } else {
                    List<Integer> indices = new ArrayList<>();
                    indices.add(i);
                    map.put(c, indices);
                }
            }
        }
        System.out.println(map);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
