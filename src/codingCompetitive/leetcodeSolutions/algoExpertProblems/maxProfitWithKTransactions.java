package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class maxProfitWithKTransactions {

    public static int maxProfitWithKTransactions(int[] prices, int k) {
        if (prices == null) return 0;
        k = k * 2;
        if (k > prices.length) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1])
                    profit += prices[i] - prices[i - 1];
            }
            return profit;
        }
        int[] profit = new int[k + 1];
        profit[0] = -prices[0];
        for (int i = 1; i <= k; i++){
            if (i % 2 == 0)
                profit[i] = Integer.MIN_VALUE;
            else profit[i] = 0;
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < profit.length; j++) {
                if (j == 0)
                    profit[j] = Math.max(profit[j], -prices[i]);
                else if (j % 2 == 0)
                    profit[j] = Math.max(profit[j], profit[j - 1] - prices[i]);
                else profit[j] = Math.max(profit[j], profit[j - 1] + prices[i]);
            }
        }
        return profit[k - 1];
    }

    public static void main(String[] args) {
        int[] prices = {5, 11, 3, 50, 60, 90};
        int k = 2;
        System.out.println(maxProfitWithKTransactions(prices, k));
    }
}
