package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class BracketSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bracket = reader.readLine();
        System.out.println(is_correct_bracket_seq(bracket));
    }

    public static boolean is_correct_bracket_seq(String bracket) {
        Stack<Character> stack = new Stack<>();
        for (char c : bracket.toCharArray()) {
            if (c == '{') stack.push('}');
            else if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
