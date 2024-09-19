package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class FindAndReplacePattern {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Character> map = new HashMap<>();
            HashMap<Character, Character> rev = new HashMap<>();
            boolean f = true;
            for (int j = 0; j < pattern.length(); j++) {
                char word = words[i].charAt(j);
                char pat = pattern.charAt(j);
                if (!map.containsKey(pat)) {
                    map.put(pat, word);
                }
                if (!rev.containsKey(word))
                    rev.put(word, pat);
                if (rev.get(word) != pat) {
                    f = false;
                    break;
                }
                if (map.get(pat) != word) {
                    f = false;
                    break;
                }
            }
            if (f) res.add(words[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"ef","fq","ao","at","lx"};
        String pattern = "ya";
        System.out.println(findAndReplacePattern(words, pattern));
    }
}
