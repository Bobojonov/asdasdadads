package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SingleThreadedCPU {

    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] sorted = new int[n][3];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : a[2] - b[2]));
        for (int i = 0; i < n; i++) {
            sorted[i][0] = tasks[i][0];
            sorted[i][1] = tasks[i][1];
            sorted[i][2] = i;
        }
        Arrays.sort(sorted, (a, b) -> a[0] - b[0]);
        int[] res = new int[n];
        long time = 0;
        int task_idx = 0;
        int res_idx = 0;
        while (task_idx < n || !pq.isEmpty()) {
            if (pq.isEmpty() && time < sorted[task_idx][0]) time = sorted[task_idx][0];

            while (task_idx < n && time >= sorted[task_idx][0]) {
                pq.add(sorted[task_idx]);
                task_idx++;
            }
            assert pq.peek() != null;
            time += pq.peek()[1];
            res[res_idx++] = pq.peek()[2];
            pq.remove();
        }
        return res;
    }
}
