package codingCompetitive.algorithm.graph;

//https://cses.fi/problemset/task/1192/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public class CountingRooms {
    static int[] neighborX = {0, 0, 1, -1};
    static int[] neighborY = {1, -1, 0, 0};
    static int n, m;
    static char[][] grid;
    static boolean[][] visited;

    private static void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.' && !visited[i][j]) {
                    dfsIterative(i, j);
                    count++;
                }
            }
        }
        out.println(count);
        out.flush();
        br.close();
    }

    public static boolean isValid(int r, int c) {
        return r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == '.' && !visited[r][c];
    }

    public static void dfsIterative(int r, int c) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{r, c});
        visited[r][c] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0], y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + neighborX[i];
                int ny = y + neighborY[i];
                if (isValid(nx, ny)) {
                    stack.push(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        run();
    }
}
