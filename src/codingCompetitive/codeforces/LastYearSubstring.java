package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastYearSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if (s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0')
                System.out.println("YES");
            else if (s.charAt(0) == '2' && s.charAt(n - 3) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0')
                System.out.println("YES");
            else if (s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(3) == '0')
                System.out.println("YES");
            else if (s.charAt(n - 4) == '2' && s.charAt(n - 3) == '0' && s.charAt(n - 2) == '2' && s.charAt(n - 1) == '0')
                System.out.println("YES");
            else if (s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(n - 1) == '0')
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

}


