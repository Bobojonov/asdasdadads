package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, result = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
