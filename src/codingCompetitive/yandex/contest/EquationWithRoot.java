package codingCompetitive.yandex.contest;

import java.io.*;

public class EquationWithRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (c < 0) System.out.println("NO SOLUTION");
        else {
            if (a + b == c * c && 2 * a + b == c * c) System.out.println("MANY SOLUTIONS");
            else if (a != 0 && (c * c - b) % a == 0) System.out.println((c * c - b) / a);
            else System.out.println("NO SOLUTION");
        }
        reader.close();
        writer.close();
    }
}
