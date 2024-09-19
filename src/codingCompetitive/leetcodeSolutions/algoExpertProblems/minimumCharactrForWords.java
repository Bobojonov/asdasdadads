package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashMap;

public class minimumCharactrForWords {

    public static char[] minimumCharactersForWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder result = new StringBuilder();
        for (String word: words) {
            HashMap<Character, Integer> curr = new HashMap<>();
            for (char ch: word.toCharArray()) {
                curr.put(ch, curr.getOrDefault(ch, 0) + 1);
                if (!map.containsKey(ch)) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                    result.append(ch);
                }
                else if (curr.get(ch) > map.get(ch)){
                    map.put(ch, map.get(ch) + 1);
                    result.append(ch);
                }
            }
        }
        return result.toString().toCharArray();
    }
 
    public static void main(String[] args) {
        String[] words = {"this", "that", "did", "deedd", "them!", "a"};
        System.out.println(minimumCharactersForWords(words));
    }
}
