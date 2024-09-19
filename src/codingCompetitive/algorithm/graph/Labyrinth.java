package codingCompetitive.algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Labyrinth {

    static int[] neighborX = {-1, 1, 0, 0};
    static int[] neighborY = {0, 0, -1, 1};
    static char[] direction = {'U', 'D', 'L', 'R'};
    static int n, m;
    static char[][] grid;
    static boolean[][] visited;
    static char[][] previousStep;
    static Point start, end;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        run();
    }

    private static void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        visited = new boolean[n][m];
        previousStep = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'A') {
                    start = new Point(i, j);
                }
            }
        }

        solveLabyrinth();
        out.flush();
        br.close();
    }

    static void solveLabyrinth() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.x == end.x && point.y == end.y) {
                System.out.println("YES");
                reconstructPath(point);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int x = point.x + neighborX[i];
                int y = point.y + neighborY[i];

                if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y] && grid[x][y] != '#') {
                    visited[x][y] = true;
                    queue.add(new Point(x, y));
                    previousStep[x][y] = direction[i];
                }
            }
        }
        System.out.println("NO");
    }

    static void reconstructPath(Point end) {
        StringBuilder path = new StringBuilder();

        while (end.x != start.x || end.y != start.y) {
            char step = previousStep[end.x][end.y];
            path.append(step);

            switch (step) {
                case 'U':
                    end.x++;
                    break;
                case 'D':
                    end.x--;
                    break;
                case 'L':
                    end.y++;
                    break;
                case 'R':
                    end.y--;
                    break;
            }
        }

        System.out.println(path.length());
        System.out.println(path.reverse().toString());
    }
}

