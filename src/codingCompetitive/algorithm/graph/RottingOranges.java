package codingCompetitive.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        LinkedList<Integer> q = new LinkedList<Integer>();
        int r = grid.length;
        int c = grid[0].length;
        int oranges = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) oranges++;
                else if (grid[i][j] == 2) queue.offer(new int[] {i, j});
            }
        }
        int minutes = 0;
        if (oranges == 0) return 0;
        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir: dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if (x < 0 || y < 0 || x >= r || y >= c || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    queue.offer(new int[] {x, y});
                    oranges--;
                }
            }
        }
        return oranges == 0 ? minutes - 1 : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,1},{0,1,2}};
        System.out.println(orangesRotting(grid));
    }
}
