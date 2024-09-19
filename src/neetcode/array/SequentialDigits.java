package neetcode.array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 1; i <= 9; i++) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            int x = q.poll();
            if (x <= high && x >= low) result.add(x);
            if (x > high) break;
            int n = x % 10;
            if (n < 9)
                q.add(x * 10 + n + 1);
        }
        return result;
    }
    
}
