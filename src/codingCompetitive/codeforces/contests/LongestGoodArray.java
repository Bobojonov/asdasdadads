package codingCompetitive.codeforces.contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestGoodArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String[] str = reader.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            int cnt = 1;
            int diff = 1;
            while (l < r) {
                if (l + 2 * diff + 1 <= r) {
                    l += diff;
                    diff += 1;
                    cnt++;
                } else {
                    cnt++;
                    break;
                }
            }
            System.out.println(cnt);
        }
        reader.close();
    }
}
