package codingCompetitive.yandex.contest.practice;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 4;
        while (a <= n) {
            if (a == n) {
                break;
            }
            a = a << 2;
        }
        if (a == n) System.out.println(true);
        else System.out.println(false);
    }
}
