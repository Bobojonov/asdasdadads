package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class MaximumTrailingZerosCorneredPath {

    public static void main(String[] args) {
        int[][] grid = {{23,17,15,3,20},{8,1,20,27,11},{9,4,6,2,21},{40,9,1,10,6},{22,7,4,5,3}};
        maxTrailingZeros(grid);
    }
    public static int maxTrailingZeros(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] r2 = new int[n][m];
        int[][] c2 = new int[n][m];
        int[][] r5 = new int[n][m];
        int[][] c5 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x2 = grid[i][j], x5 = grid[i][j];
                int cnt2 = 0, cnt5 = 0;
                while (x2 % 2 == 0) {
                    x2 /= 2;
                    cnt2++;
                }
                while (x5 % 5 == 0) {
                    x5 /= 5;
                    cnt5++;
                }
                r2[i][j] = cnt2;
                c2[i][j] = cnt2;
                r5[i][j] = cnt5;
                c5[i][j] = cnt5;
            }
        }
        System.out.println(Arrays.deepToString(r2));
        System.out.println(Arrays.deepToString(r5));
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int min = Math.min()
//                
//            }
//        }
        return 0;
    }
}
