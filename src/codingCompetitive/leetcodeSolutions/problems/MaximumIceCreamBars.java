package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumIceCreamBars {

    public int maxIceCream(int[] costs, int coins) {
        int iceCream = 0;
        int max = costs[0];
        for (int cost: costs)
            max = Math.max(max, cost);
        int[] count = new int[max + 1];
        for (int cost: costs) count[cost]++;
        for (int i = 1; i <= max; i++) {
            if (coins < i) break;
            if (count[i] == 0) continue;
            int cnt = Math.min(count[i], coins / i);
            coins -= i * cnt;
            iceCream += cnt;
        }
        return iceCream;
    }
}
