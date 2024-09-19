package codingCompetitive.leetcodeSolutions.problems;

public class bestTimeToBuy {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > min) max = Math.max(max,prices[i] - min);
            else min = prices[i];
        }
        return max;
    }
}
