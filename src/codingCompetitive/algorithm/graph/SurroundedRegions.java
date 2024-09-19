package codingCompetitive.algorithm.graph;

import java.util.Arrays;

public class SurroundedRegions {

    public static void solve(char[][] board) {
        if (board.length == 0) return;
        int r = board.length, c = board[0].length;
        for (int i = 0; i < r; i++) {
            if (board[i][0] == 'O')
                dfs(i, 0, board);
            if (board[i][c - 1] == 'O')
                dfs(i, c - 1, board);
        }
        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < c; i++) {
            if (board[0][i] == 'O')
                dfs(0, i, board);
            if (board[r - 1][i] == 'O')
                dfs(r - 1, i, board);
        }
        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == '*')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
        System.out.println(Arrays.deepToString(board));
    }

    public static void dfs(int r, int c, char[][] board) {
        if (r >= 0 && c >= 0 && r < board.length && c < board[0].length && board[r][c] == 'O') {
            board[r][c] = '*';
            dfs(r + 1, c, board);
            dfs(r - 1, c, board);
            dfs(r, c + 1, board);
            dfs(r, c - 1, board);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
        solve(board);
    }
}
