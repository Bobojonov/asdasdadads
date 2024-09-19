package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.*;

public class phoneNumberMnemonics {

    public static ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('0', new ArrayList<>(Arrays.asList('0')));
        map.put('1', new ArrayList<>(Arrays.asList('1')));
        map.put('2', new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put('4', new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put('6', new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
        ArrayList<String> letters = new ArrayList<>();
        helper(phoneNumber.toCharArray(), 0, letters, map);
        return letters;
    }

    public static void helper(char[] phone, int idx, ArrayList<String> letters, Map<Character, List<Character>> map) {
        if (idx == phone.length) {
            letters.add(new String(phone));
            return;
        }
        List<Character> dial = map.get(phone[idx]);
        char prev = phone[idx];
        for (int i = 0; i < dial.size(); i++) {
            phone[idx] = dial.get(i);
            helper(phone, idx + 1, letters, map);
        }
        phone[idx] = prev;
    }

    public static void main(String[] args) {
        String phoneNumber = "1905";
        System.out.println(phoneNumberMnemonics(phoneNumber));
    }
}
