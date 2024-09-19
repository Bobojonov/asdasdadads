package codingCompetitive.leetcodeSolutions.algoAndDs.ds;

public class GCD {

    public static int gcd (int n1, int n2) {
        if (n1 == 0)
            return n2;
        return gcd(n2 % n1, n1);
    }
}
