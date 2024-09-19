package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class wordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        for (String word1: words1) {
            for (String word2: words2) {
                if (isSubset(word1, word2))result.add(word1);
            }
        }
        return result;
    }
    public boolean isSubset(String word1, String word2) {
        int[] map = new int[26];
        for(char c: word1.toCharArray())
        map[c - 'a']++;
        for (char c: word2.toCharArray()) {
            if (map[c - 'a'] - 1 < 0) return false;
            else map[c - 'a']--;
        }
        return true;
    }
}
