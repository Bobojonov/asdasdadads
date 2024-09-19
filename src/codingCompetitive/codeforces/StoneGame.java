package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoneGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int min_pos = 0;
            int max_pos = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(s[i]);
                if (min > x) {
                    min = x;
                    min_pos = i;
                }
                if (max < x) {
                    max = x;
                    max_pos = i;
                }
            }
            int pos1 = Math.min(min_pos, max_pos);
            int pos2 = Math.max(min_pos, max_pos);
            System.out.println(Math.min(pos2 + 1, Math.min(pos1 + n + 1 - pos2, n - pos1)));



        }
    }
}
