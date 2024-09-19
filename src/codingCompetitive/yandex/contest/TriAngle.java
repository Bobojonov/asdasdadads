package codingCompetitive.yandex.contest;

import java.io.*;

public class TriAngle {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a + b > c && a + c > b && b + c > a) System.out.println("YES");
        else System.out.println("NO");
        reader.close();
        writer.close();
    }
}
