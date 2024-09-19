package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class ValidWordAbbr {

    HashMap<String, String> map;
    public ValidWordAbbr(String[] dictionary) {
        for (String dict: dictionary) {
            String k = getAbbreviation(dict);
            if (map.containsKey(k)) {
                if (!map.get(k).equals(dict)) {
                    map.put(k, "");
                }
            } else
                map.put(k, dict);
        }
        System.out.println(map);
    }
    public String getAbbreviation(String dict) {
        if (dict.length() <= 2) return dict;
        return dict.charAt(0) + Integer.toString(dict.length() - 2) + dict.charAt(dict.length() - 1);
    }
    public boolean isUnique(String word) {
        return !map.containsKey(getAbbreviation(word)) || map.get(getAbbreviation(word)).equals(word);
    }
}
