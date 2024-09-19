package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FalseCoin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < m; t++) {
            sc.nextLine();
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            boolean[] f = new boolean[n];
            for (int i = 0; i < k; i++) {
                String s = sc.nextLine();
                st = new StringTokenizer(s);
                int total = st.countTokens();
                int[] pans = new int[total];
                for (int j = 0; j < pans.length; j++)
                    pans[j] = Integer.parseInt(st.nextToken());
                if (sc.nextLine().charAt(0) == '=')
                    for (int j = 0; j < pans.length; j++)
                        f[pans[j] - 1] = true;
            }
            int zero = 0;
            int idx = 1;
            for (int i = 0; i < f.length; i++) {
                if (!f[i]) {
                    zero++;
                    idx = i + 1;
                }
            }
            if (zero == 1) System.out.println(idx);
            else System.out.println(0);
            if (t < m - 1) System.out.println();
        }
    }
}
