package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class EcologicalPremium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n--> 0) {
            int f = sc.nextInt();
            int sum = 0;
            while (f --> 0) {
                int f1 = sc.nextInt(), f2 = sc.nextInt(), f3 = sc.nextInt();
                sum += f1 * f3;
            }
            System.out.println(sum);
        }
    }
}
