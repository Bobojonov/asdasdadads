package codingCompetitive.leetcodeSolutions.problems;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray()) {
            System.out.println(st.peek());
            if (!st.isEmpty()) {
                if (c == ')' || c == ']' || c == '}') {
                    if (c == st.peek()) st.pop();
                    else return false;
                }
                st.add(c);
            } else st.add(c);
        }
        if (st.isEmpty()) return true;
        else return false;
    }
}
