package neetcode.stack;

import java.util.Stack;

public class MakeTheGreatString {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) stack.push(s.charAt(i));
            else {
                char a = stack.pop();
                char b = s.charAt(i);
                char aLower = Character.toLowerCase(a);
                char bLower = Character.toLowerCase(a);
                if (aLower == bLower) {
                    if (Character.isLowerCase(a) && Character.isLowerCase(b) || (Character.isUpperCase(a) && Character.isUpperCase(b))) {
                        stack.push(a);
                        stack.push(b);
                    }
                } else {
                    stack.push(a);
                    stack.push(b);
                }
            }
            System.out.println(stack);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
