package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class DateBugs {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        int cases = 1;
        while ((n = sc.nextInt()) != 0) {
            Vector<Integer> vc = new Vector<>();
            Vector<Integer> diff = new Vector<>();
            int cur = 0;
            for (int i = 0; i < n; i++) {
                int y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
                diff.add(b - a);
                vc.add(y);
                cur = Math.max(y, cur);
            }
            for (; cur < 10000; cur++) {
                boolean correct = true;
                for (int j = 0; j < diff.size(); j++) {
                    if ((cur - vc.get(j)) % diff.get(j) != 0) correct = false;
                }
                if (correct) break;
            }
            System.out.println("Case #" + cases++ + ":");
            if (cur < 10000)
                System.out.println("The actual year is " + cur + ".");
            else System.out.println("Unknown bugs detected.");
            System.out.println();
        }
    }
}
