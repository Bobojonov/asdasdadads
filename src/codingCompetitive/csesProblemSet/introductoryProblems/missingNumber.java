package codingCompetitive.csesProblemSet.introductoryProblems;

import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = Long.parseLong(sc.nextLine());
        Long sum = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).sum();
        System.out.println(n * (n + 1) / 2 - sum);
    }
}
