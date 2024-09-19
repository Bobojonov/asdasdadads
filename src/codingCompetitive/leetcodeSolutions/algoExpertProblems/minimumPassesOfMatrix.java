package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.LinkedList;
import java.util.Queue;

public class minimumPassesOfMatrix {
    public static int minimumPassesOfMatrix(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        int r = matrix.length, c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] > 0) queue.add(new int[]{i, j});
            }

        }
        int count = 0;
        int[][] depth = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            boolean hasNegative = false;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] q = queue.poll();
                for (int[] x : depth) {
                    int row = q[0] + x[0];
                    int column = q[1] + x[1];
                    if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[0].length
                            || matrix[row][column] >= 0) continue;
                    matrix[row][column] *= -1;
                    queue.add(new int[]{row, column});
                    hasNegative = true;
                }
            }
            if (hasNegative) count++;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] < 0) return -1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {0, -1, -3, 2, 0},
                {1, -2, -5, -1, -3},
                {3, 0, 0, -4, -1}
        };
        System.out.println(minimumPassesOfMatrix(matrix));
    }

}

// SOLUTION #1
/*
 static boolean hasNegative;
  public int minimumPassesOfMatrix(int[][] matrix) {
     Queue<int[]> queue = new LinkedList<>();
        int r = matrix.length, c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                if (matrix[i][j] > 0) queue.add(new int[]{i, j});
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            Queue<int[]> newQueue = queue;
            hasNegative = false;
            queue = new LinkedList<>();
            while (!newQueue.isEmpty()) {
                int[] x = newQueue.peek();
                int i = x[0];
                int j = x[1];
                newQueue.remove();
                dfs(i + 1, j, matrix, queue);
                dfs(i - 1, j, matrix, queue);
                dfs(i, j - 1, matrix, queue);
                dfs(i, j + 1, matrix, queue);
            }
            System.out.println(hasNegative);
            if (hasNegative) count++;
        }
    for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] < 0) return -1;
            }
    }
        return count;
  }

  public static void dfs(int r, int c, int[][] matrix, Queue<int[]> queue) {
        if (r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length || matrix[r][c] >= 0) return;
        matrix[r][c] = matrix[r][c] * (-1);
        queue.add(new int[]{r, c});
        hasNegative = true;
    }
 */