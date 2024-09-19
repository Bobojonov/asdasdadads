package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.List;

public class riverSIze {
    public static List<Integer> rivercounts(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 1)
                    list.add(dfs(count, i, j, matrix));
            }
        }
        return list;
    }

    public static int dfs(int count, int i, int j, int[][] matrix) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0) return 0;
        matrix[i][j] = 0;
        int up = dfs( count,i + 1, j, matrix);
        int down = dfs(count, i - 1, j, matrix);
        int left = dfs(count, i, j - 1, matrix);
        int right = dfs(count, i, j + 1, matrix);
        count += up + down + left + right + 1;
        return count;
    }


    public static void main(String[] args) {

    }
}
