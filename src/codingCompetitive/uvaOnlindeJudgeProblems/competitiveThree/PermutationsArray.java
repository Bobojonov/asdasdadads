package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            sc.nextLine();
            String[] str = sc.nextLine().split(" ");
            int[] index = new int[str.length];
            for (int i = 0; i < str.length; i++)
                index[i] = Integer.parseInt(str[i]) - 1;
            str = sc.nextLine().split(" ");
            String[] res = new String[str.length];
            for (int i = 0; i < str.length; i++) {
                res[index[i]] = str[i];
            }
            for (int i = 0; i < str.length; i++)
                System.out.println(res[i]);
            if (t >= 1) System.out.println();
        }
    }
}
