package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (!st.isEmpty() && map.get(c).equals(st.peek())) st.pop();
                else return false;
            } else st.push(c);
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }
}
