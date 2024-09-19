package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

import java.util.BitSet;

public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
        while (xor != 0) {
            if (xor % 2 == 1)
                cnt++;
            xor >>= 1;
        }
        return xor;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        System.out.println(hammingDistance(x, y));
    }
}
