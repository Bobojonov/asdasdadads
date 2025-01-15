package codingCompetitive.advanceOfCode;

import java.util.ArrayList;
import java.util.List;

public class DayFiveTaskOne extends AOCTasks{

    public DayFiveTaskOne() {
        super("5");
    }
    @Override
    void solve(List<String> input) {
        List<List<Character>> stacks = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            stacks.add(new ArrayList<>());
        List<String> stacksInput = input.subList(0, 8);
        System.out.println(stacksInput);
        for (String s: stacksInput) {
            int index = 0;
            int strIndex2 = 0;
            while (strIndex2 < s.length()) {
                if (s.charAt(strIndex2) != ' ')
                    stacks.get(index).add(0, s.charAt(strIndex2 + 1));
                index++;
                strIndex2 += 4;
            }
        }
        List<List<Character>> copy = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            copy.add(new ArrayList<>(stacks.get(i)));
        List<String> insttructions = input.subList(10, input.size());
        for (String i: insttructions) {
            // Part 1
            String[] parts = i.split(" ");
            int toMove = Integer.parseInt(parts[1]);
            int from   = Integer.parseInt(parts[3]) - 1;
            int to     = Integer.parseInt(parts[5]) - 1;
            List<Character> fromStack = stacks.get(from);
            List<Character> toStack   = stacks.get(to);
            List<Character> moving    = new ArrayList<>();
            for (int j = 0; j < toMove; j++)
                moving.add(fromStack.remove(fromStack.size() - 1));
            toStack.addAll(moving);

            // Part 2
            fromStack = copy.get(from);
            toStack = copy.get(to);
            moving = new ArrayList<>();
            for(int j = 0; j < toMove; j++)
                moving.add(0, fromStack.remove(fromStack.size() - 1));
            toStack.addAll(moving);
        }
        StringBuilder str = new StringBuilder();
        for(List<Character> stack : stacks)
            str.append(stack.get(stack.size() - 1));
        lap(str.toString());
        str = new StringBuilder();
        for(List<Character> stack : copy)
            str.append(stack.get(stack.size() - 1));
        lap(str.toString());
    }

    public static void main(String[] args) {
        DayFiveTaskOne dayFiveTaskOne = new DayFiveTaskOne();
    }

}
