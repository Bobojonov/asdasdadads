package codingCompetitive.leetcodeSolutions.problems;

public class LongestLineConsecutiveOne {

    public int longestLine(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if (n == 0) return 0;
        int res = 0;
        int[] col = new int[n];
        int[] diagonal = new int[n + m];
        int[] anti_diagonal = new int[n + m];
        for (int i = 0; i < m; i++) {
            int r = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    r++;
                    col[j]++;
                    diagonal[j + i]++;
                    anti_diagonal[j - i + m]++;
                    res = Math.max(res, r);
                    res = Math.max(res, col[j]);
                    res = Math.max(res, diagonal[j + i]);
                    res = Math.max(res, diagonal[j - i + m]);
                }
                else {
                    r = 0;
                    col[j] = 0;
                    diagonal[j + i] = 0;
                    anti_diagonal[j - i + m] = 0;
                }
            }
        }
        return res;
    }

}
