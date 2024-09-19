package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.Objects;
import java.util.StringTokenizer;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> p1 = new HashMap<>();
        HashMap<String, Character> p2 = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s);
        if (pattern.length() != st.countTokens()) return false;
        for (char c: pattern.toCharArray()) {
            String tmp = st.nextToken();
            if (p1.containsKey(c)) {
                if (!p1.get(c).equals(tmp)) return false;
            }
            if (p2.containsKey(tmp)) {
                if (!p2.get(tmp).equals(c)) return false;
            }
            p1.put(c, tmp);
            p2.put(tmp, c);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
