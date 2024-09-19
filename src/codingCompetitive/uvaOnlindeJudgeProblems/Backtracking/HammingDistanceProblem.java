package codingCompetitive.uvaOnlindeJudgeProblems.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HammingDistanceProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            backtracking(a, b, "");
            if (t > 0)
                System.out.println();
        }
    }

    public static void backtracking(int a, int b, String comb) {
        if (comb.length() == a) {
            if (b == 0)
                System.out.println(comb);
            return;
        }
        backtracking(a, b, comb + '0');
        backtracking(a, b - 1, comb + '1');
    }
}
