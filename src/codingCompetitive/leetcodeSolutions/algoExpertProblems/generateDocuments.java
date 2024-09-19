package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashMap;
import java.util.Map;

public class generateDocuments {
    public static boolean generateDocument(String characters, String document) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: characters.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch: document.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) return false;
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String chars = "asfasfasa";
        String docs = "dasfdsfgsdf";
        System.out.println(generateDocument(chars, docs));
    }
}
