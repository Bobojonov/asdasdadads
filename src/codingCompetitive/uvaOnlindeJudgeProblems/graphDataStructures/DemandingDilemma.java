package codingCompetitive.uvaOnlindeJudgeProblems.graphDataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class DemandingDilemma {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            boolean[][] f = new boolean[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    f[i][j] = sc.next().charAt(0) == '1';
            HashSet<String> set = new HashSet<>();
            boolean res = true;
            for (int i = 0; i < m; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) if (f[j][i]) cnt++;

                if (cnt == 2) {
                    String s = "";
                    for (int j = 0; j < n; j++)
                        if (f[j][i]) s = s + j + "_";
                    if (set.contains(s)) res = false;
                    else set.add(s);
                } else res = false;
                if (!res) break;
            }
            if (res) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
