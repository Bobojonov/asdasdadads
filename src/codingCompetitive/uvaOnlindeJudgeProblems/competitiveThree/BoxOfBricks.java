package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BoxOfBricks {

    public static void main(String[] args) throws Throwable {

        Scanner sc = new Scanner(System.in);
        String s;
        int sets = 1;
        while (!(s = sc.nextLine()).equals("0")) {
            System.out.println("Set #" + sets++);
            int n = Integer.parseInt(s);
            int[] bricks = new int[n];
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int sum = 0;
            for (int i = 0; i < n; i++) {
                bricks[i] = Integer.parseInt(st.nextToken());
                sum += bricks[i];
            }
            int avg = sum / n;
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (bricks[i] > avg)
                    res += bricks[i] - avg;
            }
            System.out.println("The minimum number of moves is " + res + ".\n");
        }

    }
}
