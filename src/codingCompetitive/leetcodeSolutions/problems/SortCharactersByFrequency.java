package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {
        System.out.println(frequency("Aabb"));
    }

    public static String frequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c))
                map.put(c, map.getOrDefault(c, 0) + 1);
            else map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> characters = new ArrayList<>(map.keySet());
        Collections.sort(characters, (a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            sb.append(String.valueOf(c).repeat(map.get(c)));
        }
        return sb.toString();
    }
}
