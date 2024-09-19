package codingCompetitive.leetcodeSolutions.problems;

import java.util.Scanner;

public class teaWithTangerines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int result = 0;
            for (int num: a) {
                result += (num - 1) / (2 * a[0] - 1);
            }
            System.out.println(result);
        }
    }
}
