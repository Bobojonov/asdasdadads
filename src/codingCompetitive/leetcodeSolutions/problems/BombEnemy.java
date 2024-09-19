package codingCompetitive.leetcodeSolutions.problems;

public class BombEnemy {

    public int maxKilledEnemies(char[][] grid) {
        int max = 0, r = grid.length, c = grid[0].length, hits = 0;
        int[] col_hits = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j == 0 || grid[i][j - 1] == 'W') {
                    hits = 0;
                    for (int k = j; k < c && grid[i][k] != 'W'; k++)
                        hits += grid[i][k] == 'E' ? 1 : 0;
                }
                if (i == 0 || grid[i - 1][j] == 'W') {
                    col_hits[j] = 0;
                    for (int k = i; k < r && grid[k][j] != 'W'; k++)
                        col_hits[j] += grid[k][j] == 'E' ? 1 : 0;
                }
                if (grid[i][j] == '0')
                    max = Math.max(max, hits + col_hits[j]);
            }
        }
        return max;
    }
}
