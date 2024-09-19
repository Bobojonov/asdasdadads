package codingCompetitive.leetcodeSolutions.problems;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int t = 10;
        while (t --> 0) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), sum = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double average = sum * 1.0 / n;
            int cnt = 0;
            sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] * 1.0 <= average) {
                    sum += arr[i];
                    cnt++;
                }
            }
            System.out.println(cnt);
            if (cnt > 0) average = sum * 1.0 / cnt;
            else average = 0;
            System.out.printf("%.2f", average);
        }
    }
}
