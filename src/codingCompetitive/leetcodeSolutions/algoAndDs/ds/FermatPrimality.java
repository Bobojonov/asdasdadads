package codingCompetitive.leetcodeSolutions.algoAndDs.ds;

public class FermatPrimality {

    static boolean isPrime(int p, int testNum) {
        for (int i = 0; i < testNum; i++) {
            int n = (int) (Math.random() * p) + 1;
            if (mod(n, p - 1, p) != 1) {
                System.out.println(n);
                return false;
            }
        }
        return true;
    }
    private static int mod(int n, int i, int p) {
        int res = 1;
        for (int j = 0; j < i; j++) {
            res *= n;
            res %= p;
        }
        return res % p;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(96, 1));
    }
}
