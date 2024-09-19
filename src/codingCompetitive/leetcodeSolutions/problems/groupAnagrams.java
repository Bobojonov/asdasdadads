package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            System.out.println(key);
            if (!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
