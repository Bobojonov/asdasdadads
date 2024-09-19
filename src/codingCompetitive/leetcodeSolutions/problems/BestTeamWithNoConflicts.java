package codingCompetitive.leetcodeSolutions.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BestTeamWithNoConflicts {

    static class Player {
        public int score;
        public int age;
        public Player(int age, int score) {
            this.age = age;
            this.score = score;
        }
    }
    public static int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[] dp = new int[n];
        int res = 0;
        Player[] p = new Player[n];

        for (int i = 0; i < n; i++)
            p[i] = new Player(ages[i], scores[i]);
        Arrays.sort(p, (p1, p2) -> p1.age == p2.age ? p2.score - p1.score : p2.age - p1.age);
        for (int i = 0; i < n; i++) {
            dp[i] = p[i].score;
            for (int j = 0; j < i; j++)
                if (p[j].score >= p[i].score)
                    dp[i] = Math.max(dp[i], dp[j] + p[i].score);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] scores = {1,3,5,10,15};
        int[] ages = {1,2,3,4,5};
        System.out.println(bestTeamScore(scores, ages));
    }
}
