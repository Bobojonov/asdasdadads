package codingCompetitive.leetcodeSolutions.dynamicProgramming;

import java.util.Arrays;

public class MinimumCostForTickets {
    public static int mincostTickets(int[] days, int[] costs) {
//        int[] dp = new int[366];
//        int[] day = new int[366];
//        for (int i = 0; i < days.length; i++) {
//            day[days[i] + 1]++;
//        }
//        for (int i = 0; i < 366; i++) {
//            if (day[days[i] + 1] > 0) dp[i] = Math.min();
//        }
        return 1;
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2, 7, 15};
        System.out.println(mincostTickets(days, costs));
    }
}
