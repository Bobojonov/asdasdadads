package codingCompetitive.leetcodeSolutions.problems;

public class divideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = dividend >= 0 == divisor >= 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while (dividend - divisor >= 0) {
            int count = 0;
            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }
            result += 1 << count;
            dividend -= divisor << count;
        }
        System.out.println(result);
        System.out.println(sign);
        return sign ? result : -result;
//        if (dividend == -2147483648 && divisor == -1) {
//            return 2147483647;
//        }
//        int negatives = 0;
//        if (dividend < 0){
//            negatives++;
//            dividend = -dividend;
//        }
//        if (divisor < 0){
//            negatives++;
//            divisor = -divisor;
//        }
//        int subtrc = 0;
//        while (dividend - divisor >= 0){
//            subtrc++;
//            dividend -= divisor;
//        }
//        if (negatives == 1) subtrc = -subtrc;
//        return subtrc;
    }
    public static void main(String[] args) {
        int dividend = 7;
        int divisor = -3;
        System.out.println(divide(dividend, divisor));
    }
}
