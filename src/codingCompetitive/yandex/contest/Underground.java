package codingCompetitive.yandex.contest;

import java.io.*;

public class Underground {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        long min1 = (long) (n - 1) * (a + 1) + 1;
        long min2 = (long) (m - 1) * (b + 1);
        long min = Math.max(min1, min2);
        long max1 = (long) (n - 1) * (a + 1) + a + 1;
        long max2 = (long) (m - 1) * (b + 1) + b;
        long max = Math.min(max1 + a + 1, max2);
        if (max >= min) System.out.println(min + " " + max);
        else System.out.println(-1);
        reader.close();
    }
}
