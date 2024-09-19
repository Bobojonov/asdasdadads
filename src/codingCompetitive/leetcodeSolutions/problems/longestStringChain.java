package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class longestStringChain {

    public int longestStrChain(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word: words)
            map.put(word, word.length());
        return 1;
    }
}
