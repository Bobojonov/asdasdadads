package codingCompetitive.leetcodeSolutions.algoAndDs.ds;

import java.util.Arrays;

public class SubsetSum {

    boolean subsetSum(int[] set, int sum) {
        boolean[][] a = new boolean[set.length][sum + 1];
        Arrays.sort(set);
        a[0][set[0]] = true;
        for (int i = 1; i < a.length; i++) {
            a[i - 1][0] = true;
            for (int j = 1; j < a[i].length; j++) {
                if (j < set[i])
                    a[i][j] = a[i - 1][j];
                else
                    a[i][j] = a[i - 1][j] || a[i - 1][j - set[i]];
            }
        }
        return a[set.length - 1][sum];
    }
}
