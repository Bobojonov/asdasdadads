package codingCompetitive.leetcodeSolutions.problems;



public class concatenationOfConsecutiveBinaryNumbers {
    public static int concatenatedBinary(int n) {
        int m = 1000000007;
        int len = 0;
        long res = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) len++;
            res = ((res << len) | i) % m;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(concatenatedBinary(n));


    }



}
