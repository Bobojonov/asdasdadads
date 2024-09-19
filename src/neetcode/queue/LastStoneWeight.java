package neetcode.queue;

import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for (int s: stones)
            pr.offer(-s);
        System.out.println(pr);
        while (pr.size() > 1) {
            int x = pr.poll();
            int y = pr.poll();
            if (y > x) pr.offer(x - y);
        }
        pr.offer(0);
        return Math.abs(pr.peek());
    }
}
