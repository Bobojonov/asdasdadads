package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NearestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        String[] str = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int x = Integer.parseInt(reader.readLine());
        int min = 1000, res = 0;
        for (int i = 0; i < n; i++) {
            if (min > Math.abs(arr[i] - x)) {
                min = Math.abs(arr[i] - x);
                res = arr[i];
            }
        }
        System.out.println(res);
        reader.close();
    }
}
