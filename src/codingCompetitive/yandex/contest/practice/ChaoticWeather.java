package codingCompetitive.yandex.contest.practice;

import java.util.Scanner;

public class ChaoticWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1) System.out.println(1);
        else {
            int cnt = 0;
            boolean prev = true;
            for (int i = 0; i < n - 1; i++) {
                boolean current = arr[i] > arr[i + 1];
                if (prev && current) cnt++;
                prev = !(current || arr[i] == arr[i + 1]);
            }
            if (prev) cnt++;
            System.out.println(cnt);
        }
    }
}
