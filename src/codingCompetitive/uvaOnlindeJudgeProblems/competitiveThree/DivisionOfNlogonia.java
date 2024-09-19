package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivisionOfNlogonia {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int k = in.nextInt();
        while (k != 0) {
            int n = in.nextInt(), m = in.nextInt();
            while (k--> 0) {
                int x = in.nextInt(), y = in.nextInt();
                if (x == n || y == m)
                    System.out.println("divisa");
                else if (x < n && y > m)
                    System.out.println("NO");
                else if(x > n && y > m)
                    System.out.println("NE");
                else if (x > n && y < m)
                    System.out.println("SE");
                else System.out.println("SO");
            }
            k = in.nextInt();
        }
    }
}
