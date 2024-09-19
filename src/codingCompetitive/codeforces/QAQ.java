package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QAQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0, a = 0, q = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Q') {
                cnt += a;
                q++;
            } else if (s.charAt(i) == 'A')
                a += q;
        }
        System.out.println(cnt);
    }
}
