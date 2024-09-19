package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

public class FindPeakElementII {

    public int[] findPeakGrid(int[][] mat) {
        int r = mat.length + 2;
        int c = mat[0].length + 2;
        int[][] grid = new int[r][c];
        for (int i = 0; i < c; i++) {
            grid[0][i] = -1;
            grid[r - 1][i] = -1;
        }

        for (int i = 1; i < r; i++) {
            grid[i][0] = -1;
            grid[i][c - 1] = -1;
        }
        for (int i = 1; i <= r - 2; i++)
            for (int j = 1; j <= c - 2; j++)
                grid[i][j] = mat[i - 1][j - 1];
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (grid[i][j] > grid[i][j + 1] && grid[i][j] > grid[i][j - 1] &&
                        grid[i][j] > grid[i + 1][j] && grid[i][j] > grid[i - 1][j])
                    return new int[]{i - 1, j - 1};
            }
        }
        return new int[]{-1, -1};
    }
}
