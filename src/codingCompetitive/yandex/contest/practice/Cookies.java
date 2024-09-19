package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        String[] s = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int m = Integer.parseInt(reader.readLine());
        int[] b = new int[m];
        s = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(maxSatisfiedChildren(n, m, a, b));
        reader.close();
    }
    
    public static int maxSatisfiedChildren(int n, int m, int[] a, int[] b) {
        int cnt = 0;
        int cookieIndex = 0;
        for (int i = 0; i < n; i++) {
            while (cookieIndex < m && b[cookieIndex] < a[i])
                cookieIndex++;
            if (cookieIndex < m) {
                cnt++;
                cookieIndex++;
            } else break;
        }
        return cnt;
    }
}
