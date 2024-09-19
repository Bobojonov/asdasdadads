package codingCompetitive.yandex;

import java.io.*;

public class Error {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        int[] x = new int[t];
        int[] y = new int[t];
        int total = 0;
        for (int i = 0; i < t; i++) {
            String[] s = reader.readLine().split(" ");
            x[i] = Integer.parseInt(s[0]);
            y[i] = Integer.parseInt(s[1]);
            total += x[i] * y[i];
        }
        for (int i = 0; i < t; i++) {
            System.out.printf("%.12f%n", x[i] * y[i] * 1.0 / total);
        }
        reader.close();
        writer.close();
    }
}
