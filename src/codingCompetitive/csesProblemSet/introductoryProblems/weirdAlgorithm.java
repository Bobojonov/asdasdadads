package codingCompetitive.csesProblemSet.introductoryProblems;

import java.util.Scanner;

public class weirdAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.print(n);
        while (n > 1) {
            if ((n & 1) == 0) n /= 2;
            else n = n * 3 + 1;
            System.out.print(" " + n);
        }
    }
}
