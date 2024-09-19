package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class MaximumTastinessOfCandyBasket {

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        if (k > price.length) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = price.length - 1; i > price.length - k; i--) {
            min = Math.min(min, Math.abs(price[i]- price[i - 1]));
        }
        return min;
    }
}
