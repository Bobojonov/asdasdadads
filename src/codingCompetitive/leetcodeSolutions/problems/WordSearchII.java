package codingCompetitive.leetcodeSolutions.problems;

public class WordSearchII {
    private static final int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    
    public static boolean backtrack(char[][] board, String word, int r, int c, int index) {
        if (index == word.length()) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index) || visited[r][c]) return false;
        visited[r][c] = true;
        if (backtrack(board, word, r + 1, c, index + 1) || backtrack(board, word, r - 1, c, index + 1) ||
                backtrack(board, word, r, c + 1, index + 1) || backtrack(board, word, r, c - 1, index + 1))
            return true;
        visited[r][c] = false;
        return false;
    }
}
