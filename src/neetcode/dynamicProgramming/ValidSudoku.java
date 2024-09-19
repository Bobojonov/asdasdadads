package neetcode.dynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cell = board[i][j];
                int key = (i / 3) * 3 + j / 3;
                if (cell == '.') continue;
                if (rows.getOrDefault(i, new HashSet<>()).contains(cell) ||
                        cols.getOrDefault(j, new HashSet<>()).contains(cell) || 
                                squares.getOrDefault(key, new HashSet<>()).contains(cell)) return false;
                cols.computeIfAbsent(j, k -> new HashSet<>()).add(cell);
                rows.computeIfAbsent(i, k -> new HashSet<>()).add(cell);
                squares.computeIfAbsent(key, k -> new HashSet<>()).add(cell);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(squares);
        return true;
    }
}
