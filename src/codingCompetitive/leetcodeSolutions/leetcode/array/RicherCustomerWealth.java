package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.Arrays;

public class RicherCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int[] account : accounts) {
            sum = Math.max(sum, Arrays.stream(account).sum());
        }
        return sum;
    }
}
