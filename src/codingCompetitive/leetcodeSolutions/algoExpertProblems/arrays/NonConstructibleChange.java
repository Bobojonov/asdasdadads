package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        int create = 0;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (coin > create + 1) break;
            create += coin;
        }
        return create + 1;
    }
}
