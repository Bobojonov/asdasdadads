package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class JillRidesAgain {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int cases = 1; cases <= t; cases++) {
            int n = sc.nextInt(), sum = 0;
            Vector<Integer> vc = new Vector<>();
            for (int i = 0; i < n - 1; i++)
                vc.add(sc.nextInt());
            int i = -1, maxI = -1, maxJ = -1, maxSum = 0;
            for (int j = 0; j < n - 1; j++) {
                sum += vc.get(j);
                if (i == -1) i = j;
                if (sum > maxSum || (sum == maxSum && j - i > maxJ - maxI)) {
                    maxSum = sum;
                    maxI = i;
                    maxJ = j;
                }
                if (sum < 0) {
                    sum = 0;
                    i = -1;
                }
            }
            if (maxSum <= 0)
                System.out.println("Route " + cases + " has no nice parts");
            else
                System.out.println("The nicest part of route " + cases + " is between stops " + (maxI + 1) + " and " + (maxJ + 2));
        }

    }
}
