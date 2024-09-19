package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class numberOfWaysToMakeChange {

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        if (denoms.length == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int denom: denoms) {
            for (int j = 1; j < dp.length; j++) {
                if (denom <= j) {
                    dp[j] += dp[j - denom];
                }
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] denoms = {1, 10, 5, 25};
        System.out.println(numberOfWaysToMakeChange(n, denoms));
    }

}
