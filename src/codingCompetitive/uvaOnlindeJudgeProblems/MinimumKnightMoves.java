package codingCompetitive.uvaOnlindeJudgeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumKnightMoves {
    static final int[][] dirs = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            bfs(reader.readLine().split(" "));
        }
        reader.close();
    }

    public static void bfs(String[] str) {
        int[] start = new int[2];
        int[] dest = new int[2];
        start[0] = str[0].charAt(0) - 'a';
        start[1] = str[0].charAt(1) - '0' - 1;
        dest[0] = str[1].charAt(0) - 'a';
        dest[1] = str[1].charAt(1) - '0' - 1;
        int[][] visited = new int[8][8];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = 1;
        int res = 0;
        while (!queue.isEmpty()) {
            int[] a = queue.poll();
            int x = a[0], y = a[1], d = a[2];
            if (x == dest[0] && y == dest[1]) {
                res = d;
                break;
            }
            for (int i = 0; i < 8; i++) {
                int dirX = x + dirs[i][0];
                int dirY = y + dirs[i][1];
                if (dirX >= 0 && dirX < 8 && dirY >= 0 && dirY < 8 && visited[dirX][dirY] == 0) {
                    visited[dirX][dirY] = 1;
                    queue.add(new int[]{dirX, dirY, d + 1});
                }
            }
        }
        System.out.println(res);
    }
}
