package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class sortStack {
    public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        if (stack.size() == 0) return stack;
        int top = stack.remove(stack.size() - 1);
        stack = sortStack(stack);
        sorting(stack, top);
        return stack;
    }

    public static void sorting(ArrayList<Integer> stack, int top) {
        if (stack.size() == 0) {
            stack.add(top);
            return;
        }
        int curr = stack.get(stack.size() - 1);
        if (curr > top) {
            stack.remove(stack.size() - 1);
            sorting(stack, top);
            stack.add(curr);
        } else stack.add(top);
        return;
    }

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>(Arrays.asList(-5, 2, -2, 4, 3, 1));
        System.out.println(sortStack(stack));
    }
}
