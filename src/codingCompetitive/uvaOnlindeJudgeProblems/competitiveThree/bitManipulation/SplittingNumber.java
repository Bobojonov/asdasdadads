package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.io.IOException;
import java.util.Scanner;

public class SplittingNumber {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            int a = 0, b = 0;
            int add = 1;
            boolean addToA = true;
            while (n != 0) {
                if ((n & 1) == 1) {
                    if (addToA) a += add;
                    else b += add;
                    addToA = !addToA;
                }
                add *= 2;
                n /= 2;
            }
            System.out.println(a + " " + b);
        }

    }
}