package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class GarbageHeap {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            long[][][] cube = new long[a][b][c];
            for (int i = 0; i < a; i++)
                for (int j = 0; j < b; j++)
                    for (int k = 0; k < c; k++)
                        cube[i][j][k] = sc.nextLong();
            long[][][] dp = new long[a][b][c];
            for (int i = 0; i < a; i++)
                for (int j = 0; j < b; j++)
                    for (int k = 0; k < c; k++) {
                        dp[i][j][k] = cube[i][j][k];
                        if (i > 0) dp[i][j][k] += dp[i - 1][j][k];
                        if (j > 0) dp[i][j][k] += dp[i][j - 1][k];
                        if (k > 0) dp[i][j][k] += dp[i][j][k - 1];
                        if (i > 0 && j > 0) dp[i][j][k] += dp[i - 1][j - 1][k];
                        if (i > 0 && k > 0) dp[i][j][k] += dp[i - 1][j][k - 1];
                        if (j > 0 && k > 0) dp[i][j][k] += dp[i][j - 1][k - 1];
                        if (i > 0 && j > 0 && k > 0) dp[i][j][k] += dp[i - 1][j - 1][k - 1];
                    }
            long max=Long.MIN_VALUE;
            for (int i = 0; i < a; i++) for (int i1 = 0; i1 < b; i1++) for (int i2 = 0; i2 < c; i2++) {
                for (int j = i; j < a; j++) for (int j1 = i1; j1 < b; j1++) for (int j2 = i2; j2 < c; j2++) {
                    long cur = dp[j][j1][j2];
                    if (i > 0) cur -= dp[i - 1][j1][j2];
                    if (i1 > 0) cur -= dp[j][i1 - 1][j2];
                    if (i2 > 0) cur -= dp[j][j1][i2 - 1];
                    if (i > 0 && i1 > 0) cur -= dp[i - 1][i1 - 1][j2];
                    if (i > 0 && i2 > 0) cur -= dp[i - 1][j1][i2 - 1];
                    if (i1 > 0 && i2 > 0) cur -= dp[j][i1 - 1][i2 - 1];
                    if (i > 0 && i1 > 0 && i2 > 0) cur -= dp[i - 1][i1 - 1][i2 - 1];
                    max = Math.max(cur, max);
                }
            }
            System.out.println(max);
            if (t > 0) System.out.println();
        }
    }
}
