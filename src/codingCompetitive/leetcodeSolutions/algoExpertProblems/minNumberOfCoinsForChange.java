package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class minNumberOfCoinsForChange {

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int denom: denoms) {
            for (int i = 1; i < dp.length; i++) {
                if (i >= denom)
                    dp[i] += Math.max(dp[i], dp[i - denom] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;
        int[] denoms = {1, 5, 10};
        System.out.println(minNumberOfCoinsForChange(n, denoms));
    }
}
