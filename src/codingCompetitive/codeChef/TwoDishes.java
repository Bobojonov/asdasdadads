package codingCompetitive.codeChef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TwoDishes {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            int c = Integer.parseInt(str[3]);
            if (Math.min(b, a + c) >= n) System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
        writer.close();
    }

    public static boolean canMake(int n, int a, int b, int c) {
        if (n == 0) return true;
        if (a > 0 && b > 0) {
            if (canMake(n - 1, a - 1, b - 1, c)) {
                return true;
            }
        }
        if (b > 0 && c > 0) {
            if (canMake(n - 1, a, b - 1, c - 1)) {
                return true;
            }
        }
        return false;
    }
}
