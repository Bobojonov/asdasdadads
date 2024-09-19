package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cases = 0;
        while ((n = sc.nextInt()) != 0) {
            boolean found = false;
            cases++;
            if (cases > 1) System.out.println();
            for (int i = 1234; i < 50000; i++) {
                int num = i * n;
                if (check(num, i)) {
                    System.out.printf("%05d / %05d = %d\n", num, i, n);
                    found = true;
                }
            }
            if (!found) System.out.printf("There are no solutions for %d.\n", n);
        }
    }

    public static boolean check(int n, int m) {
        if (n > 100000) return false;
        int mask = 0, r;
        for (int i = 0; i < 5; i++) {
            r = (int)(n / Math.pow(10, i)) % 10;
            if ((mask >> r) % 2 == 1) return false;
            mask |= 1 << r;
        }
        for (int i = 0; i < 5; i++) {
            r = (int) (m / Math.pow(10, i)) % 10;
            if ((mask >> r) % 2 == 1)
                return false;
            mask |= 1 << r;
        }
        return true;
    }
}
