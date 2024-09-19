package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackMax {
    private final Stack<Integer> stack;
    private final Stack<Integer> maxStack;

    public StackMax() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("error");
        } else {
            int removedElement = stack.pop();
            if (removedElement == maxStack.peek())
                maxStack.pop();
        }
    }

    public void get_max() {
        if (maxStack.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(maxStack.peek());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StackMax stackMax = new StackMax();
        while (n-- > 0) {
            String command = reader.readLine();
            if (command.startsWith("get_max"))
                stackMax.get_max();
            else if (command.startsWith("push"))
                stackMax.push(Integer.parseInt(command.split(" ")[1]));
            else stackMax.pop();
        }
    }
}
