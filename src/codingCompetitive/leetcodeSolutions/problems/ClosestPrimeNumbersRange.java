package codingCompetitive.leetcodeSolutions.problems;

import java.util.Vector;

public class ClosestPrimeNumbersRange {
    static int max = 1000001;
    static boolean[] primes = new boolean[max];
    static Vector<Integer> prime;
    public int[] closestPrimes(int left, int right) {
        findPrimes(left, right);
        int min_diff = Integer.MAX_VALUE;
        int l = -1, r = -1;
        for (int i = 0; prime.size() != 0 && i < prime.size() - 1; i++) {
            int diff = prime.get(i + 1) - prime.get(i);
            if (diff < min_diff) {
                l = prime.get(i);
                r = prime.get(i + 1);
                min_diff = diff;
            } else if (diff == min_diff) l = Math.min(l, prime.get(i));
        }
        if (l != -1 && r != -1 ) return new int[] {l, r};
        else return new int[]{-1, -1};
    }

    static void findPrimes(int l, int r) {
        for (int i = 2; i <= max; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= max; j += i)
                    primes[j] = true;
            }
        }
        for (int i = l; i <= r; i++)
            if (!primes[i]) prime.add(i);
    }
}
