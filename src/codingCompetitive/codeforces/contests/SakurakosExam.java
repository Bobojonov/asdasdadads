package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SakurakosExam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t --> 0) {
            String[] str = reader.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int total_sum = a + 2 * b;
            String res;
            if (total_sum % 2 != 0) res = "NO";
            else {
                total_sum /= 2;
                if (total_sum % 2 == 0 || a >= total_sum % 2) res = "YES";
                else res = "NO";
            }
            System.out.println(res);
        }
        reader.close();
    }
}
