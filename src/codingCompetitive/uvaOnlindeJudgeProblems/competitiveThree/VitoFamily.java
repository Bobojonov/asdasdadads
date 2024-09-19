package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VitoFamily {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int[] a = new int[500];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            while (st.hasMoreTokens()) {
                a[cnt++] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a, 0, cnt);
            int median = a[cnt / 2];
            int res = 0;
            for (int i = 0; i < cnt; i++)
                res += Math.abs(median - a[i]);
            System.out.println(res);
        }


    }
}
