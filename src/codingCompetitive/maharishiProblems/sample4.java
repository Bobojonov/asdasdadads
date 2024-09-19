package codingCompetitive.maharishiProblems;

public class sample4 {
    public static int f(int n){
        int result = 0;
        while (Math.abs(n) > 0){
            result = result * 10 + n % 10;
            n /= 10;
        }
        if (n < 0) return -result; else return result;
    }
    public static void main(String[] args) {
        int n = -12345;
        System.out.println(f(n));
    }
}
