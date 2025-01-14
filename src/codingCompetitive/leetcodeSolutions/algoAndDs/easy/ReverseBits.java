package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

public class ReverseBits {
    public int reverseBits(int n) {
        if (n == 0) return 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += n & 1;
            n >>= 1;
        }
        return  res;
    }
}
