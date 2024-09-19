package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageTransmissionErrorII {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (i * 2 <= n) continue;
            String sub = s.substring(0, i);
            if (sub.equals(s.substring(n - i))) {
                System.out.println("YES");
                System.out.println(sub);
                return;
            }
        }
        System.out.println("NO");
        reader.close();
    }
}
