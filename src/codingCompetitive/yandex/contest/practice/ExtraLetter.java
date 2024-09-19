package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExtraLetter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int[] arr = new int[26];
        for (char c: a.toCharArray())
            arr[c - '0' - 49]++;
        for (char c: b.toCharArray())
            arr[c - '0' - 49]--;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println((char)('a' + i));
                break;
            }
        }
    }
}
