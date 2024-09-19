package neetcode.stack;

import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i].charAt(tokens[i].length() - 1))) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int x = stack.pop();
                int y = stack.pop();
                if (Objects.equals(tokens[i], "+")) stack.push(x + y);
                else if (Objects.equals(tokens[i], "-")) stack.push(y - x);
                else if (Objects.equals(tokens[i], "/")) stack.push(y / x);
                else stack.push(x * y);
            }
        }
        return stack.pop();
    }
}
