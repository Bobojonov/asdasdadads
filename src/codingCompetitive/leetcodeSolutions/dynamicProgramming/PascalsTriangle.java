package codingCompetitive.leetcodeSolutions.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows + 1][numRows + 1];
        dp[0][1] = 1;
        for (int i = 1; i < numRows; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                if (dp[i][j] != 0) curr.add(dp[i][j]);
            }
            res.add(curr);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(3));
        System.out.println(generate(4));
        System.out.println(generate(5));
    }
}
