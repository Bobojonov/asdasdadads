package codingCompetitive.uvaOnlindeJudgeProblems.Backtracking;

import java.io.IOException;
import java.util.Scanner;

public class SultansSuccessors {
    static int sum, score;
    static int[][] board;
    static boolean[] diagonal1, diagonal2, col;
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            board = new int[8][8];
            diagonal1 = new boolean[15];
            diagonal2 = new boolean[15];
            col = new boolean[8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            score = -1;
            sum = 0;
            backtracking(0);
            System.out.printf("%5d\n", score);
        }
    }

    public static void backtracking(int n) {
        if (n == 8) {
            score = Math.max(score, sum);
        }
        for (int i = 0; i < 8; i++) {
            if (!col[i] && !diagonal1[n - i + 7] && !diagonal2[n + i]) {
                col[i] = true;
                diagonal1[n - i + 7] = true;
                diagonal2[n + i] = true;
                sum += board[n][i];
                backtracking(n + 1);
                col[i] = false;
                diagonal1[n - i + 7] = false;
                diagonal2[n + i] = false;
                sum -= board[n][i];
            }
        }
    }
}
