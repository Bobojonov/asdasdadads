package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingSumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            String[] str = reader.readLine().split(" ");
            int sum = 0;
            boolean sign = true;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(str[i]);
                if (sign) sum += x;
                else sum -= x;
                sign = !sign;
            }
            System.out.println(sum);
        }
        reader.close();
    }
}
