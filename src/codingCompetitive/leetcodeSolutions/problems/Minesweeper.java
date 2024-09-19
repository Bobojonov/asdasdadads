package codingCompetitive.leetcodeSolutions.problems;

public class Minesweeper {

    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length, n = board[0].length;
        int r = click[0], c = click[1];
        if (board[r][c] == 'M') board[r][c] = 'X';
        else {
            int cnt = 0;
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i == 0 || j == 0) continue;
                    int x = r + i;
                    int y = c + j;
                    if (x < 0 || x >= m || y < 0 || y >= n) continue;
                    if (board[x][y] == 'M' || board[x][y] == 'X') cnt++;
                }
            }
            if (cnt > 0) board[r][c] = (char) (cnt + '0');
            else {
                board[r][c] = 'B';
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        if (i == 0 || j == 0) continue;
                        int x = r + i;
                        int y = c + j;
                        if (x < 0 || x >= m || y < 0 || y >= n) continue;
                        if (board[x][y] == 'E') updateBoard(board, new int[] {x, y});
                    }
                }
            }
        }
        return board;
    }


}
