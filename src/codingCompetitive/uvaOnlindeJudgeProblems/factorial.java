package codingCompetitive.uvaOnlindeJudgeProblems;

import java.math.BigInteger;

public class factorial {

    public static void main(String[] args) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= 25; i++)
            fac = fac.multiply(BigInteger.valueOf(i));
        System.out.println(fac);
    }
}
