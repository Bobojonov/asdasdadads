package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class TheSnail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result;
        while (true) {
            double h = sc.nextDouble(), u = sc.nextDouble(), d = sc.nextDouble(), f = sc.nextDouble();
            if (h == 0) break;
            int day = 0;
            double height = 0;
            f = (u * f) / 100.0;
            while (true) {
                day++;
                height += u;
                u -= f;
                if (u < 0)
                    u = 0;
                if (height > h) {
                    result = true;
                    break;
                }
                height -= d;
                if (height < 0) {
                    result = false;
                    break;
                }
            }
            if (!result) System.out.println("failure on day " + day);
            else System.out.println("success on day " + day);
        }
        return;
    }
}
