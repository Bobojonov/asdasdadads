package codingCompetitive.leetcodeSolutions.problems;

import java.util.PriorityQueue;

public class queueReconstruction {

    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> {
            return a[1] == b[1] ? a[0] - b[0] : a[0] - b[0];
        });
        for (int[] p : people) pq.offer(p);
        int[][] result = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            result[i][0] = pq.peek()[0];
            result[i][1] = pq.peek()[1];
            pq.poll();
        }
        return result;

    }

}
