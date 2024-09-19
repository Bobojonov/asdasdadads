package codingCompetitive.yandex.contest.practice;

import java.util.Scanner;

public class Factorization {
    static boolean[] prime = new boolean[1000000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorize(n);
    }
    
    public static void factorize(long n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}
