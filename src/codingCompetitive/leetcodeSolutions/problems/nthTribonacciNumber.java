package codingCompetitive.leetcodeSolutions.problems;

public class nthTribonacciNumber {

    public static int tribonacci(int n){
        if (n < 3) if (n == 0) return 0; else return 1;
        else {
            int n1 = 0, n2 = 1, n3 = 1;
            for (int i = 3; i <= n; i++){
                int tmp = n1 + n2 + n3;
                n1 = n2;
                n2 = n3;
                n3 = tmp;
            }
            return n3;
        }

    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }
}
