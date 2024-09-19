package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoosingTeams {
    private static final int[] mark = new int[1001];

    public static void divisibleByThree() {
        int i = 1, cnt = 1;
        while (i <= 1000) {
            if (cnt % 10 != 3 && cnt % 3 != 0) {
                mark[i] = cnt;
                i++;
            }
            cnt++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        divisibleByThree();
        while (t-- > 0) {
            int x = Integer.parseInt(reader.readLine());
            System.out.println(mark[x]);
        }
    }
}
