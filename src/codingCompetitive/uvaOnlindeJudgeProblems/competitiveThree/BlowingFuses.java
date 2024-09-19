package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class BlowingFuses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seq = 1, sum, max;

        int[] a = new int[22];
        boolean[] on = new boolean[22];
        boolean safe;
        while (true) {
            int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
            if (n == 0 && m == 0 && c == 0) break;
            System.out.println("Sequence " + seq);
            seq++;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                on[i] = false;
            }
            safe = true;
            sum = 0;
            max = 0;
            for (int i = 1; i <= m; i++) {
                int x = sc.nextInt();
                if (on[x]) sum -= a[x];
                else {
                    sum += a[x];
                    max = Math.max(max, sum);
                    if (sum > c) safe = false;
                }
                on[x] = !on[x];
            }
            if (safe) {
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was " + max + " amperes.");
            } else System.out.println("Fuse was blown.");
            System.out.println();
        }
    }
}
