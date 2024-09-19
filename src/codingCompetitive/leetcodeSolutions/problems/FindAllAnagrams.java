package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(i, s, p)) ls.add(i);
        }
        return ls;
    }

    public static boolean isAnagram(int idx, String s, String t) {
        int[] letters = new int[26];
        for (int i = idx; i < idx + t.length(); i++)
            letters[s.charAt(i) - 'a']++;
        for (int j = 0; j < t.length(); j++){
            letters[t.charAt(j) - 'a'] -= 1;
            if (letters[t.charAt(j) - 'a'] < 0) return false;
        }
        return true;
    }
}
