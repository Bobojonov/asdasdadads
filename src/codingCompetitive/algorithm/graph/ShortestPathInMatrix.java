package codingCompetitive.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInMatrix {
    private final int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 0) return -1;
        Queue<int[]> queue = new LinkedList<>();
        int res = 0;
        queue.add(new int[]{0, 0});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                int[] q = queue.poll();
                if (q[0] == n - 1 && q[1] == n - 1) {
                    return res;
                }
                for (int j = 0; j < 8; j++) {
                    int x = q[0] + dirs[j][0];
                    int y = q[1] + dirs[j][1];
                    if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
        return -1;
    }
}
