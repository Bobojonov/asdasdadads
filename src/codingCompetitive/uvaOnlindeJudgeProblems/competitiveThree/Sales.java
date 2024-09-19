package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sales {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            int t = Integer.parseInt(s);
            while (t --> 0) {
                int n = Integer.parseInt(br.readLine());
                int[] a = new int[1001];
                int res = 0, temp, j;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    temp = Integer.parseInt(st.nextToken());
                    for (j = i - 1; j >= 0; j--) {
                        if (temp < a[j])
                            a[j + 1] = a[j];
                        else break;
                    }
                    a[j + 1] = temp;
                    res += j + 1;
                }
                System.out.println(res);
            }
        }

    }
}
