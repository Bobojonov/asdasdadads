package neetcode.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int[] point : points) {
            int dist = (int) Math.sqrt(point[0] * point[0] + point[1] * point[1]);
            pq.offer(new int[]{dist, point[0], point[1]});
        }
        System.out.println(pq);
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] point = pq.poll();
            assert point != null;
            result[i] = new int[]{point[1], point[2]};
        }
        return result;
    }
}
