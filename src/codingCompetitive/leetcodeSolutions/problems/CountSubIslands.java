package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class CountSubIslands {
    static int[] neighborX = {0, 0, 1, -1};
    static int[] neighborY = {1, -1, 0, 0};
    static boolean[][] color = new boolean[501][501];
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1 && grid1[i][j] == 0)
                    dfs(grid1, grid2, i, j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1) {
                    dfs(grid1, grid2, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public static void dfs(int[][] grid1, int[][] grid2, int row, int col) {
        int n = grid1.length;
        int m = grid1[0].length;
        if (row < 0 || row == n || col < 0 || col == m || grid2[row][col] == 0) return;
        grid2[row][col] = 0;
        dfs(grid1, grid2, row + 1, col);
        dfs(grid1, grid2, row - 1, col);
        dfs(grid1, grid2, row, col + 1);
        dfs(grid1, grid2, row, col - 1);
    }
    
}
