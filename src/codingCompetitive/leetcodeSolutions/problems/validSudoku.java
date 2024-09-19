package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        Boolean result = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String x = "(" + board[i][j] + ")";
                    if (set.contains(x + i) || set.contains(j + x) || set.contains(i / 3 + x + j / 3))
                        return false;
                    else {
                        set.add(x + i);
                        set.add(j + x);
                        set.add(i / 3 + x + j / 3);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
