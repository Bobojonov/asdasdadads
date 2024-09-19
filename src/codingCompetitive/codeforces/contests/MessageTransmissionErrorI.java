package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageTransmissionErrorI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = 0, j = 1;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            } else {
                j -= i - 1;
                i = 0;
            }
        }
        if (i > j - i) {
            System.out.println("YES");
            System.out.println(s.substring(0, i));
        } else System.out.println("NO");
        reader.close();
    }
}
