package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MachinedSurfaces {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;
            int min = -1;
            int[] spaces = new int[n];
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                int spaceCount = 0;
                for (int j = 0; j < 25; j++)
                    if (s.charAt(j) != 'X') spaceCount++;
                spaces[i] = spaceCount;
                if (spaceCount < min || min == -1)
                    min = spaceCount;
            }
            int res = 0;
            for (int i = 0; i < n; i++) res += spaces[i] - min;
            System.out.println(res);
        }
    }
}
