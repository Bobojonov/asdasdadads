package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class minimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        int cnt = 0;
        for (int i = 0; i < queries.length; i++) {
            cnt++;
            totalWaitingTime += queries[i] * (queries.length - cnt);
        }
        return totalWaitingTime;
    }
    public static void main(String[] args) {

    }
}
