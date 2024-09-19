package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class StarGrid {

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            int n = Integer.parseInt(s);
            int[] a = new int[n];
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(str[i]);
            int[] b = new int[n];
            str = br.readLine().split(" ");
            for (int i = 0; i < n; i++)
                b[i] = Integer.parseInt(str[i]);
            int res = 0;
            int i, j;
            for (i = 0; i < n; i++) {
                for (j = i; j < n; j++) {
                    if (b[i] == a[j])
                        break;
                }
                for (int k = j; k > i; k--) {
                    a[k] = a[k - 1];
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
