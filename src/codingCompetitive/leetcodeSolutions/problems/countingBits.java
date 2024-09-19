package codingCompetitive.leetcodeSolutions.problems;

public class countingBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(countBits(n));
    }
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 1; i <= n; i++){
            if ((i & 1) == 0) res[i] = res[i >> 1];
            else res[i] = res[i - 1] + 1;
        }
        return res;
    }
}
