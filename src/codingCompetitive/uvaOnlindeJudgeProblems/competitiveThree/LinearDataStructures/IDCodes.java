package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.LinearDataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class IDCodes {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char[] ch = sc.nextLine().toCharArray();
            if (ch[0] == '#') break;
            if (nextPermutation(ch)) {
                System.out.println(Arrays.toString(ch));
                for (int i = 0; i < ch.length; i++) {
                    System.out.print(ch[i]);
                }
                System.out.println();
            } else System.out.println("No Successor");

        }
    }

    public static boolean nextPermutation(char[] per) {
        for (int i = per.length - 2; i >= 0; i--) {
            if (per[i] < per[i + 1]) {
                for (int j = per.length - 1; j >= 0; j--) {
                    if (per[j] > per[i]) {
                        char temp = per[j];
                        per[j] = per[i];
                        per[i] = temp;
                        for (i++, j = per.length - 1; i < j; i++, j--) {
                            temp = per[j];
                            per[j] = per[i];
                            per[i] = temp;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
