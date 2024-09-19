package neetcode.array;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(') stack.add(i);
            if (result.charAt(i) == ')') {
                if (!stack.isEmpty()) stack.pop();
                else result.setCharAt(i, '.');
            }
        }
        while (!stack.isEmpty()) result.setCharAt(stack.pop(), '.');
        return result.toString().replaceAll("\\.", "");
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}
