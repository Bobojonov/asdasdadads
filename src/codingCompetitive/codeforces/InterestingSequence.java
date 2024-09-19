package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterestingSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long i = a;
            while (a != 0) {
                if (a == b) {
                    System.out.println(i);
                    break;
                }
                a = a & (++i);
                if (a == 0) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
