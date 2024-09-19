package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumIncrease {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int max = 1;
        int curr = 1;
        for (int i = 1; i < t; i++) {
            if (Integer.parseInt(s[i - 1]) < Integer.parseInt(s[i])) curr++;
            else {
                max = Math.max(curr, max);
                curr = 1;
            }
        }
        System.out.println(Math.max(max, curr));
    }
}
