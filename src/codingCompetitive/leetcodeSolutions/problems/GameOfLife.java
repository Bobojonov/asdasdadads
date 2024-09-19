package codingCompetitive.leetcodeSolutions.problems;

public class GameOfLife {
    public static int[][] copied;
    public void gameOfLife(int[][] board) {
         copied = board;
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int live   = 0;
                int top    = Math.max(0, i - 1);
                int left   = Math.max(0, j - 1);
                int bottom = Math.min(r - 1, i + 1);
                int right  = Math.min(c - 1, j + 1);
                for (int k = top; k <= bottom; k++) {
                    for (int d = left; d <= right; d++) {
                        if (!(k == i && d == j) && copied[k][d] == 1) {
                            live++;
                        }
                    }
                }
                if (live < 2 || live > 3) board[i][j] = 0;
                else if (live == 3) board[i][j] = 1;
            }
        }
    }
}
