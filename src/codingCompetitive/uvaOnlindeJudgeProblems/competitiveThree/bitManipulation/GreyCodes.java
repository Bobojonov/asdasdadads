package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.util.Scanner;

public class GreyCodes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            sc.nextInt();
            int k = sc.nextInt();
            System.out.println(k ^ (k >> 1));
        }
    }
}
