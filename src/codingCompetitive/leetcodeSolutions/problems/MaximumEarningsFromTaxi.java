package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class MaximumEarningsFromTaxi {

//    public long maxTaxiEarnings(int n, int[][] rides) {
//        Arrays.sort(rides, (a, b) -> a[0] - b[0]);
//        long[] dp = new long[n + 1];
//        int i = 0;
//        for (int j = 1; j <= n; j++) {
//            dp[j] = Math.max(dp[j], dp[j - 1]);
//            while (i < rides.length && rides[i][0] == j) {
//                dp[rides[i][1]] = Math.max(dp[rides[i][1]], dp[j] + rides[i][1] - rides[i][0] + rides[i][2]);
//                ++j;
//            }
//
//        }
//    }

}
