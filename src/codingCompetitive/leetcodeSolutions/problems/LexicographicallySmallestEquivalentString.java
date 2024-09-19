package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class LexicographicallySmallestEquivalentString {

    int[] chars = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for (int i = 0; i < 26; i++)
            chars[i] = i;
        for (int i = 0; i < s1.length(); i++) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(i) - 'a';
            int x = find(c1);
            int y = find(c2);
            if (x < y) chars[y] = x;
            else chars[x] = y;
        }
        StringBuilder sb = new StringBuilder();
        for (char c: baseStr.toCharArray()) {
            char x = (char) (find(c - 'a') + 'a');
            sb.append(x);
        }
        return sb.toString();
    }

    int find(int x) {
        if (chars[x] != x)
            chars[x] = find(chars[x]);
        return chars[x];
    }
}
