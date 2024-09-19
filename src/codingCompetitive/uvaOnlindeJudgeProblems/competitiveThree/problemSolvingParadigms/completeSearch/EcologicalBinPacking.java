package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.problemSolvingParadigms.completeSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EcologicalBinPacking {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str == null || str.equals(""))
                break;
            String[] s = str.split(" ");
            int[] b = new int[3];
            int[] g = new int[3];
            int[] c = new int[3];
            for (int i = 0; i < 3; i++) {
                int cnt = 0;
                for (int j = i; j < s.length; j += 3 ){
                    if (i == 0) b[cnt++] = Integer.parseInt(s[j]);
                    else if (i == 1) g[cnt++] = Integer.parseInt(s[j]);
                    else c[cnt++] = Integer.parseInt(s[j]);
                }
            }
            int min = Integer.MAX_VALUE;
            String ans = "";
            int sum = c[0] + g[0] + b[1] + g[1] + b[2] + c[2];
            if (sum < min) {
                min = sum;
                ans = "BCG";
            }
            sum = c[0] + g[0] + b[1] + c[1] + b[2] + g[2];
            if (sum < min) {
                min = sum;
                ans = "BGC";
            }
            sum = b[0] + g[0] + g[1] + c[1] + b[2] + c[2];
            if (sum < min) {
                min = sum;
                ans = "CBG";
            }
            sum = b[0] + g[0] + b[1] + c[1] + c[2] + g[2];
            if (sum < min) {
                min = sum;
                ans = "CGB";
            }
            sum = c[0] + b[0] + b[1] + g[1] + c[2] + g[2];
            if (sum < min) {
                min = sum;
                ans = "GCB";
            }
            sum = c[0] + b[0] + g[1] + c[1] + b[2] + g[2];
            if (sum < min) {
                min = sum;
                ans = "GBC";
            }
            System.out.println(ans + " " + min);
        }
    }
}
