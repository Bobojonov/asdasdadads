package codingCompetitive.csesProblemSet.introductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class numberSpiral {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);
            if (x < y) {
                if (y % 2 == 1) {
                    long r = y * y;
                    System.out.println(r - x + 1);
                } else {
                    long r = (y - 1) * (y - 1) + 1;
                    System.out.println(r + x - 1);
                }
            } else {
                if (x % 2 == 1) {
                    long r = x * x;
                    System.out.println(r - y + 1);
                } else {
                    long r = (x - 1) * (x - 1) + 1;
                    System.out.println(r + y - 1);
                }
            }
        }

    }

}
