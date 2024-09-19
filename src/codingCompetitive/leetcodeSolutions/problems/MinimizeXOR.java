package codingCompetitive.leetcodeSolutions.problems;

public class MinimizeXOR {

    public static void main(String[] args) {
        int num1 = 64, num2 = 40;
        int bit2 = Integer.bitCount(num2);
        int res = 0;
        for (int i = 31; i > 0; i--) {
            if (bit2 < 1) break;
            if (((num1 >> i) & 1) == 1) {
                System.out.println(i);
                bit2--;
                res |= (1 << i);
            }
        }
        System.out.println(res + "adad");
        for (int i = 1; i < 32; i++) {
            if (bit2 < 1) break;
            if (((num1 >> i) & 1) == 1) {
                System.out.println(i);
                bit2--;
                res |= (1 << i);
            }
        }
        System.out.println(res);
    }
}
