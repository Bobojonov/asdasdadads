package codingCompetitive.leetcodeSolutions.problems;

import java.util.Comparator;
import java.util.TreeSet;

 class MaxStack {
    private final TreeSet<int[]> stack;
    private final TreeSet<int[]> values;
    private int cnt;
    public MaxStack() {
        Comparator<int[]> cmp = (a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        };
        stack = new TreeSet<>(cmp);
        values = new TreeSet<>(cmp);
        cnt = 0;
    }

    public void push(int x) {
        stack.add(new int[]{cnt, x});
        values.add(new int[]{cnt, x});
        cnt++;
    }

    public int pop() {
        int[] pair = stack.pollLast();
        assert pair != null;
        values.remove(new int[] {pair[1], pair[0]});
        return pair[1];
    }

    public int top() {
        return values.last()[1];
    }

    public int peekMax() {
        return values.last()[0];
    }

    public int popMax() {
        int[] pair = values.pollLast();
        assert pair != null;
        stack.remove(new int[] {pair[1], pair[0]});
        return pair[0];
    }

}
