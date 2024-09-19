package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class combinationLock {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            int ans = 1080, sum = 0;
            int[] num = new int[4];
            for (int i = 0; i < 4; i++) {
                num[i] = sc.nextInt();
                sum += num[i];
            }
            if (sum == 0) break;
            int first  = (num[0] - num[1] + 40) % 40;
            int second = (num[2] - num[1] + 40) % 40;
            int third  = (num[2] - num[3] + 40) % 40;
            System.out.println(ans +  (first + second + third) * 9);

        }
//            double n = 5.324547327;
//            int k = 4;
//            BigDecimal round = new BigDecimal(n);
//            System.out.println(round.setScale(k, BigDecimal.ROUND_HALF_UP));
//            double scale = Math.pow(10, k);
//            System.out.println(Math.round(n * scale) / scale);
//            BigDecimal bd = new BigDecimal(Math.PI);
//            bd.setScale(k, RoundingMode.HALF_UP);


    }
}
