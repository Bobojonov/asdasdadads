package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.problemSolvingParadigms.completeSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntegerSequenceFromAddition {

    private static long binpow(int a, int n) {
        if(n == 0) return 1;
        if ((n & 1) == 1) return a * binpow(a * a, n / 2);
        else return binpow(a * a, n / 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String[] st = br.readLine().split(" ");
            int d = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            long[] arr = new long[30];
            int i = 0;
            int n = Integer.parseInt(st[i]);
            for (i = 1; i < st.length; i++)
                arr[i - 1] = Integer.parseInt(st[i]);
            for (i = 0; i < st.length; i++)
                System.out.print(arr[i] + " ");
            int sum = 0;
            i = 1;
            while (true) {
                long s = 0;
                for (int j = 0; j <= n; j++)
                    s += arr[j] * binpow(i, j);
                sum += d;
                if (sum >= k) {
                    System.out.println(s);
                    break;
                }
                i++;
            }
        }
    }

}
