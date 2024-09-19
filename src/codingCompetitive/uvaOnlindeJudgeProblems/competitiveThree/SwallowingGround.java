package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class SwallowingGround {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int w = sc.nextInt() - 1;
            int x1 = sc.nextInt(), x2 = sc.nextInt();
            boolean f = true;
            int dis = x1 - x2;
            while (w --> 0) {
                int y1 = sc.nextInt(), y2 = sc.nextInt();
                if (dis != y1 - y2) f = false;
            }
            if (f) System.out.println("yes");
            else System.out.println("no");
            if (t > 0) System.out.println();
        }
    }
}
