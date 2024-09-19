package codingCompetitive.leetcodeSolutions;

public class SuperPow {
    static int mod = 1337;
    public static int superPow(int a, int[] b) {
        int n = 0;
        for (int i : b) {
            n = (n * 10 + i) % 1140;
        }
        if (n == 0) n = 1140;
        return binpow(a, n);
    }

    public static int binpow(int a, int b) {
        a %= mod;
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 7;
        int[] b = {1, 1, 4, 0};
        System.out.println(superPow(a, b));
    }
}
