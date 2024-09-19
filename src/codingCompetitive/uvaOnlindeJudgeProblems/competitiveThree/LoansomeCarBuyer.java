package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Scanner;

public class LoansomeCarBuyer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] months = new double[101];
        while (true) {
            int loanDur = sc.nextInt(); double downPay = sc.nextDouble(), amount = sc.nextDouble(); int numRec = sc.nextInt();
            if (loanDur < 0) break;

            while (numRec --> 0) {
                int n = sc.nextInt(); double per = sc.nextDouble();
                for (int i = n; i < 101; i++)
                    months[i] = per;

            }
            int now = 0;
            double monthlyPayment = amount / loanDur;
            double curVal = (amount + downPay) * (1 - months[0]);
            double curLoan = amount;
            while (curVal < curLoan) {
                now++;
                curLoan -= monthlyPayment;
                curVal = curVal * (1-months[now]);
            }
            System.out.print(now + " month");
            if (now != 1)
                System.out.println("s");
            else System.out.println();
        }
    }
}
