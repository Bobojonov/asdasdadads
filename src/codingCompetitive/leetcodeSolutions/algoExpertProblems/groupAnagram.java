package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.*;

public class groupAnagram {

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            char[] ch = words.get(i).toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(words.get(i));

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<String> words = List.of("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        System.out.println(groupAnagrams(words));
    }
}
