package codingCompetitive.leetcodeSolutions.algoAndDs.hard;

import java.util.*;

public class WordBreakII {

    static Map<String, List<String>> map = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        if (map.containsKey(s)) return map.get(s);
        List<String> res = new LinkedList<>();
        if (dict.contains(s)) res.add(s);
        for (int i = 1; i < s.length(); i++) {
            String l = s.substring(0, i), r = s.substring(i);
            if (dict.contains(l) && checkSuffix(dict, r)) {
                for (String ss : wordBreak(r, new ArrayList<>(dict))) res.add(l + " " + ss);
            }
        }
        map.put(s, res);
        return res;
    }

    public boolean checkSuffix(Set<String> dict, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (dict.contains(s.substring(i))) return true;
        }
        return false;

    }
}
