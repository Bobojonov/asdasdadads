package codingCompetitive.graph.graphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheseusAndTheMinotaur {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();
            if(s.equals("#")) break;
            StringTokenizer st = new StringTokenizer(s, ".");
            StringTokenizer st1 = new StringTokenizer(st.nextToken(), ";");
            int[][] adjacent = new int[26][26];
            int[] count = new int[26];
            boolean[] connected = new boolean[26];
            while (st1.hasMoreTokens()) {
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ":");
                int idx = st2.nextToken().charAt(0) - 'A';
                if (st2.hasMoreTokens()) {
                    for (char c: st2.nextToken().toCharArray())
                        adjacent[idx][count[idx]++] = c - 'A';
                }
            }
            System.out.println("dasda");
            StringTokenizer st2 = new StringTokenizer(st.nextToken());
            int mStart = st2.nextToken().charAt(0) - 'A';
            int tStart = st2.nextToken().charAt(0) - 'A';
            int k = Integer.parseInt(st2.nextToken());
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            while (true) {
                int tmp = mStart;
                for (int i = 0; i < count[mStart]; i++) {
                    int n = adjacent[mStart][i];
                    if (n != tStart && !connected[n]) {
                        mStart = n;
                        break;
                    }
                }
                tStart = tmp;
                if (tStart == mStart) {
                    sb.append("/");
                    sb.append((char)(mStart + 'A'));
                    break;
                }
                cnt = (cnt + 1) % k;
                if (cnt == 0) {
                    sb.append((char)(tStart + 'A'));
                    sb.append(" ");
                    connected[tStart] = true;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
