package codingCompetitive.csesProblemSet.introductoryProblems;

import java.util.Arrays;
import java.util.Scanner;

public class increasingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = 0;
        long res = 0;
        int[] arr = new int[n];
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            res += max - arr[i];
        }
        System.out.println(res);
    }
}
