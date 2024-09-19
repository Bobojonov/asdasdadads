package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sapper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int k = Integer.parseInt(str[2]);
        int[] p = new int[k];
        str = reader.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            p[i] = Integer.parseInt(str[i]);
        }

        int[] q = new int[m];
        str = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            q[i] = Integer.parseInt(str[i]);
        }
        char[][] res = new char[n][m];
        reader.close();
    }
}
