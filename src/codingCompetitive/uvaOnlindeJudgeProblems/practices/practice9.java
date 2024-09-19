package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.Scanner;

public class practice9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = sc.nextLine();
        int hex = 16, ten = 10, binary = 2;
        String x = Integer.toString(Integer.parseInt(base, hex), ten);
        String y = Integer.toString(Integer.parseInt(base, hex), binary);

        System.out.println(x);
        System.out.println(y);

    }

}
