package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;

import java.util.Scanner;

public class TheJackpot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            int sum = 0, maxSum = 0;
            for (int i = 0; i < n; i++) {
                sum += num[i];
                if (sum > maxSum) maxSum = sum;
                if (sum < 0) sum = 0;
            }
            if (maxSum > 0) System.out.println("The maximum winning streak is " + maxSum + ".");
            else System.out.println("Losing streak.");
        }
    }
}
