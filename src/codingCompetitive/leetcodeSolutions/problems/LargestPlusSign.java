package codingCompetitive.leetcodeSolutions.problems;

public class LargestPlusSign {

    public static int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = n;
        }
        for (int i = 0; i < mines.length; i++) {
            grid[mines[i][0]][mines[i][1]] = 0;
        }
        int largest = 0;
        for (int i = 0; i < n; i++) {
            int l = 0, r = 0, t = 0, b = 0,k = n - 1;
            for (int j = 0; j < n; j++) {
                l = grid[i][j] == 0 ? 0 : l + 1;
                r = grid[i][k] == 0 ? 0 : r + 1;
                t = grid[j][i] == 0 ? 0 : t + 1;
                b = grid[k][i] == 0 ? 0 : b + 1;
                grid[i][j] = Math.min(grid[i][j], l);
                grid[i][k] = Math.min(grid[i][k], r);
                grid[j][i] = Math.min(grid[j][i], t);
                grid[k][i] = Math.min(grid[k][i], b);
                k--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                largest = Math.max(largest, grid[i][j]);
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        return largest;
    }



    public static void main(String[] args) {
        int n = 5;
        int[][] mines = {{4, 2}};
        System.out.println(orderOfLargestPlusSign(n, mines));
    }
}
