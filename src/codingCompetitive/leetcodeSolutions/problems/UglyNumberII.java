package codingCompetitive.leetcodeSolutions.problems;

public class UglyNumberII {
    public static int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int f2 = 2, f3 = 3, f5 = 5;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(f2, f3), f5);
            uglyNumbers[i] = min;
            if (f2 == min)
                f2 = 2 * uglyNumbers[++index2];
            if (f3 == min)
                f3 = 3 * uglyNumbers[++index3];
            if (f5 == min)
                f5 = 5 * uglyNumbers[++index5];
        }
        return uglyNumbers[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
