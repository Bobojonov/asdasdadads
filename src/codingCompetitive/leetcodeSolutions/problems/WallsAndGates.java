package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class WallsAndGates {
    static int inf = Integer.MAX_VALUE;
    static List<int[]> dir = Arrays.asList(
            new int[] {1, 0},
            new int[] {-1, 0},
            new int[] {0, 1},
            new int[] {0, -1}
    );
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0) return;
        int m = rooms.length;
        int n = rooms[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0)
                    q.add(new int[]{i, j});
            }
        }
        while (!q.isEmpty()) {
            int[] xy = q.poll();
            int i = xy[0];
            int j = xy[1];
            for (int[] d: dir) {
                int r = i + d[0];
                int c = j + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n || rooms[r][c] != inf)
                    continue;
                rooms[r][c] = rooms[i][j] + 1;
                q.add(new int[]{r, c});
            }
        }

    }
}
