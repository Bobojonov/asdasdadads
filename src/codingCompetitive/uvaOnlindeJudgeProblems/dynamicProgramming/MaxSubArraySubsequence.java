package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubArraySubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {

            int n = sc.nextInt();
            if (n == -999999) {
                BigInteger max = BigInteger.valueOf(n);
                BigInteger value = BigInteger.valueOf(1);
                for (int i =  0; i < list.size(); i++) {
                    value = BigInteger.valueOf(1);
                    for (int j = i; j < list.size(); j++) {
                        value = value.multiply(BigInteger.valueOf(list.get(j)));
                        if (value.compareTo(max) > 0)
                            max = value;
                    }
                }
                System.out.println(max);
                list.clear();
                continue;
            }
            list.add(n);
        }
    }
}
