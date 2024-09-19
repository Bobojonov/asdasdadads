package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class MagicNumbers {

    static long max = 9876543210L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        while (t --> 0) {
            long n = sc.nextLong();
            for (int i = 1; i <= max; i++) {
                long s = n * i;
                if (s > max) break;
                if (check(i) && check(s)) System.out.println(s + " / " + i + " = " + n);
            }
            if (t > 0) System.out.println();
        }
    }

    public static boolean check(long n) {
        int mask = 0;
        while (n != 0) {
            long r = n % 10;
            if ((mask >> r) % 2 == 1) return false;
            mask |= 1 << r;
            n /= 10;
        }
        return true;
    }
}
