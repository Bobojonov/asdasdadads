package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class removeIslands {

    public static int[][] removeIslands(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < c; i++) {
            if (matrix[0][i] == 1) dfs(visited, 0, i, matrix);
        }

        for (int i = 0; i < c; i++) {
            if (matrix[r - 1][i] == 1) dfs(visited, r - 1, i, matrix);
        }

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 1) dfs(visited, i, 0, matrix);
        }

        for (int i = 0; i < r; i++) {
            if (matrix[i][c - 1] == 1) dfs(visited, i, c - 1, matrix);
        }
        for (int i =0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (matrix[i][j] == 1 && !visited[i][j]) matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static void dfs(boolean[][] visited, int i, int j, int[][] matrix) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j]) return;
        if (matrix[i][j] == 0) return;
        visited[i][j] = true;
        dfs(visited, i + 1, j, matrix);
        dfs(visited, i - 1, j, matrix);
        dfs(visited, i, j - 1, matrix);
        dfs(visited, i, j + 1, matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0, 0, 1, 1},
                {0, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1}
        };
        System.out.println(removeIslands(matrix));
    }
}

