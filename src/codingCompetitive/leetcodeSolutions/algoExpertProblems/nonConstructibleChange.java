package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class nonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int count = 0;
        for (int coin: coins){
            if (coin > count + 1)
                break;
            count += coin;
        }
        return count + 1;
    }
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

    }
}
