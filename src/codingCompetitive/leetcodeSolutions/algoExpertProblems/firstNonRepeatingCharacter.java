package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: string.toCharArray()){
            if(!map.containsKey(ch)) map.put(ch, 0);
            else map.put(ch, 1);
        }
        for (int i = 0; i < string.length(); i++) {
            if (map.get(string.charAt(i)) == 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String string = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(string));

    }
}
