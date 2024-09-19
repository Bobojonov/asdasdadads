package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NearestZero {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String[] str = rd.readLine().split(" ");
        int[] street = new int[n];
        int[] disctance = new int[n];
        for (int i = 0; i < n; i++) {
            street[i] = Integer.parseInt(str[i]);
        }
        int lastZeroIndex = -1;
        for (int i = 0; i < n; i++) {
            if (street[i] == 0) {
                lastZeroIndex = i;
                disctance[i] = 0;
            } else if (lastZeroIndex != -1) {
                disctance[i] = i - lastZeroIndex;
            } else {
                disctance[i] = Integer.MAX_VALUE;
            }
        }
        System.out.println(Arrays.toString(disctance));
        lastZeroIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (street[i] == 0) {
                lastZeroIndex = i;
                disctance[i] = 0;
            } else if (lastZeroIndex != -1) {
                disctance[i] = Math.min(disctance[i], lastZeroIndex - i);
            }
        }
        System.out.println(Arrays.toString(disctance));
    }
}
