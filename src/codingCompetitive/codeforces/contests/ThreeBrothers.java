package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeBrothers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        if (Math.abs(a - b) == 1) {
            if (a > b && b != 1) {
                System.out.println(2 * b - a);;
            } else if (a != 1) System.out.println(2 * a - b);
            else System.out.println(a + b);
        }
        else System.out.println((a + b) / 2);
        reader.close();
    }
}
