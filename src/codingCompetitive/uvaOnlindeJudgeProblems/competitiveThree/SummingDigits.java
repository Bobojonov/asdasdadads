package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class SummingDigits {

    public static int recursive(int n) {

        while (n / 10 != 0) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            System.out.println(recursive(n));
        }
    }
}
