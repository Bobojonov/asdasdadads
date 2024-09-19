package codingCompetitive.uvaOnlindeJudgeProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class formingQuizTeams {
    static int n, target;
    static double[][] distance = new double[20][20];
    static double[] memo = new double[1 << 16];

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int cases = 1;

        while (true) {
            n = Integer.parseInt(in.readLine());
            if (n == 0) break;
            int[] x = new int[20];
            int[] y = new int[20];

            for (int i = 0; i < 2 * n; i++) {
                String[] line = in.readLine().split(" ");
                int X = Integer.parseInt(line[1]);
                int Y = Integer.parseInt(line[2]);
                x[i] = X;
                y[i] = Y;
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                for (int j = i + 1; j < 2 * n; j++) {
                    distance[i][j] = Math.hypot(x[i] - x[j], y[i] - y[j]);
                }
            }

//            for (int i = 0; i < (1 << 16); i++) memo[i] = -1;
            Arrays.fill(memo, -1);
            target = (1 << (2 * n)) - 1;
            BigDecimal round = new BigDecimal(matching(0));
            System.out.println("Case " + (cases++) + ": " + round.setScale(2, BigDecimal.ROUND_HALF_UP));
        }

    }

    public static double matching(int bitmask) {
        if (bitmask == (1 << 2 * n) - 1) return 0;
        if (bitmask == target) return memo[bitmask] = 0;

        double ans = 2000000000.0;
        int p1, p2;
        for (p1 = 0; p1 < 2 * n; p1++)
            if ((bitmask & (1 << p1)) == 0)
                break;
        for (p2 = p1 + 1; p2 < 2 * n; p2++)
            if ((bitmask & (1 << p2)) == 0)
                ans = Math.min(ans, distance[p1][p2] + matching(bitmask | (1 << p1) | (1 << p2)));
        return memo[bitmask] = ans;
    }

}
