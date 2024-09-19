package codingCompetitive.leetcodeSolutions.algoAndDs.ds;

public class SieveOfEratosthenes {

    static void findPrimes(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j < primes.length; j += i)
                    primes[j] = true;
            }
        }

        for (int i = 2; i < primes.length; i++) {
            if (!primes[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        findPrimes(100);
    }
}
