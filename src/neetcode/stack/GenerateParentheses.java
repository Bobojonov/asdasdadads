package neetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public static void backtrack(int n, List<String> res, Stack<Character> stack, int open, int closed) {
        if (open == closed && open == n) {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) sb.append(c);
            res.add(sb.toString());
            return;
        }
        if (open < n) {
            stack.push('(');
            backtrack(n, res, stack, open + 1, closed);
            stack.pop();
        }

        if (closed < open) {
            stack.push(')');
            backtrack(n, res, stack, open, closed + 1);
            stack.pop();
        }
    }

    public static List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> res = new ArrayList<>();
        backtrack(n, res, stack, 0, 0);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
