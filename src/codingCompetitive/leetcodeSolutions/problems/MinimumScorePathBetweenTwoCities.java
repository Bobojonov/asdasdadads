package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumScorePathBetweenTwoCities {

    int[] dp;
    public int minScore(int n, int[][] roads) {
        dp = new int[n + 1];
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = i;
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int[] road: roads) {
            int x = find(road[0]);
            int y = find(road[1]);
            res[x] = res[y] = Math.min(road[2], Math.min(res[x], res[y]));
        }
        return res[find(1)];
    }

    public int find(int i) {
        return dp[i] == i ? i : (dp[i] = find(dp[i]));
    }
}
