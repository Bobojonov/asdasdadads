package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JustFinish {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cases = 1;
        while (t --> 0) {
            int n = sc.nextInt();
            long[] p = new long[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextLong();
            long[] q = new long[n];
            for (int i = 0; i < n; i++)
                q[i] = sc.nextLong();
            long sum = 0, min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                sum += p[i] - q[i];
                min = Math.min(min, sum);
            }
            int idx = 0;
            while (min < 0 && idx < n) {
                min -= p[idx] - q[idx];
                idx++;
            }
            System.out.print("Case " + cases++ + ": ");
            if (idx == n || sum < 0) System.out.println("Not possible");
            else System.out.println("Possible from station " + (idx + 1));
        }
    }
}
