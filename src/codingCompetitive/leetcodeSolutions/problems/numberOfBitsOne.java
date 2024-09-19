package codingCompetitive.leetcodeSolutions.problems;

public class numberOfBitsOne {

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            if ((n & mask) != 0) {
                System.out.println(n & mask);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
