package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeforcesChecking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        String x = "codeforces";
        while (t-- > 0) {
            String str = reader.readLine();
            if (x.contains(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
