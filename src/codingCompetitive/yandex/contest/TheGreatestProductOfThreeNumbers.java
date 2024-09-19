package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheGreatestProductOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = str.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int x = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int y = arr[0] * arr[1] * arr[2];
        if (x < y) System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        else System.out.println(arr[n - 1] + " " + arr[n - 2] + " " + arr[n - 3]);
    }
}
