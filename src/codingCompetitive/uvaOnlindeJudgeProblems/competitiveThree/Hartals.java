package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class Hartals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt(), p = sc.nextInt();
            int res = 0;
            int[] day = new int[100];
            for (int i = 0; i < p; i++)
                day[i] = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 7 == 6 || i % 7 == 0) continue;
                boolean found = false;
                for (int j = 0; j < p; j++) {
                    if (i % day[j] == 0)
                        found = true;
                }
                if (found) res++;
            }
            System.out.println(res);
        }
    }
}
