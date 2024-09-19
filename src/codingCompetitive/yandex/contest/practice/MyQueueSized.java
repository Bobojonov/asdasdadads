package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MyQueueSized {
    static Stack<Integer> stack;

    public MyQueueSized() {
        stack = new Stack<>();
    }

    public void push(int x, int k) {
        if (stack.size() == k) {
            System.out.println("error");
        } else
            stack.push(x);
    }

    public void pop() {
        if (stack.isEmpty())
            System.out.println("None");
        else stack.pop();
    }

    public void peek() {
        if (stack.isEmpty())
            System.out.println("None");
        else {
            System.out.println(stack.peek());
        }
    }

    public void size() {
        System.out.println(stack.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        MyQueueSized stack = new MyQueueSized();
        int k = Integer.parseInt(reader.readLine());
        while(n-- > 0) {
            String commands = reader.readLine();
            if (commands.startsWith("push"))
                stack.push(Integer.parseInt(reader.readLine().split(" ")[1]), k);
            else if (commands.startsWith("peek")) stack.peek();
            else if (commands.startsWith("pop")) stack.pop();
            else stack.size();
        }
    }
}
