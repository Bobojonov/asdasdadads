package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class MaximalRectangle {

    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] h = new int[n];
        Arrays.fill(r, n);
        int max = 0;
        for (int i = 0; i < m; i++) {
            int left = 0, right = n;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    h[j]++;
                else
                    h[j] = 0;
            }
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    l[j] = Math.max(l[j], left);
                else {
                    l[j] = 0;
                    left = j + 1;
                }
            }
            System.out.println(Arrays.toString(h));
            System.out.println(Arrays.toString(l));
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    r[j] = Math.min(r[j], right);
                }
                else {
                    r[j] = n;
                    right = j;
                }
            }
            System.out.println(Arrays.toString(r));
            for (int j = 0; j < n; j++)
                max = Math.max(max, (r[j] - l[j]) * h[j]);
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] m = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalRectangle(m));
    }
}
