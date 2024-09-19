package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;

public class WaterFallStreams {
    double[] res;
    public double[] waterfallStreams(double[][] array, int source) {
        res = new double[array[0].length];
        Arrays.fill(res, 0.0);
        array[0][source] = -1;
        dfs(array, 0, source, 100.0, 0);

        return res;
    }

    public void dfs(double[][] array, int i, int j, double percent, double direction) {
        if (i == array.length - 1) {
            res[j] += percent;
            return;
        }
        if (i < 0 || j < 0 || j > array[0].length - 1 || array[i][j] == 1)
            return;

        if (array[i + 1][j] == 0)
            dfs(array, i + 1, j, percent, 0);
        else {
            if (direction == 0) {
                dfs(array, i, j - 1, percent / 2, -1);
                dfs(array, i, j + 1, percent / 2, 1);
            }
            else if (direction == 1) dfs(array, i, j + 1, percent, 1);
            else dfs(array, i, j - 1, percent, -1);

        }
    }
}
