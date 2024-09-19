package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClosestSums {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            System.out.println("Case " + cases++ + ":");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            int m = sc.nextInt();
            int res = 0, query = 0;
            while (m -- > 0) {
                query = sc.nextInt();
                res = nums[0] + nums[1];
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        int cur = nums[i] + nums[j];
                        if (Math.abs(res - query) > Math.abs(cur - query)) res = cur;
                    }
                }
                System.out.println("Closest sum to " + query + " is " + res + ".");
            }

        }
    }
}
