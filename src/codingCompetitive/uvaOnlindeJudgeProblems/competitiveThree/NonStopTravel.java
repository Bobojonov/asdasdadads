package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NonStopTravel {

    static int [][] arr;
    static double [] pos;

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int cases = 1;
        while (true) {
            String s;
            while ((s = br.readLine()).equals(""));
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            if (n == -1) break;
            arr = new int[n][3];
            pos = new double[n];
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine());
                pos[i] = Double.parseDouble(st.nextToken());
                for (int j = 0; j < 3; j++) {
                    if (!st.hasMoreTokens())
                        st = new StringTokenizer(br.readLine());
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            boolean found = false;
            out.append("Case " + cases++ + ":");
            StringBuilder sb = new StringBuilder();
            for (int i = 30; i <= 60; i++) {
                if (valid(i)) {
                    int x = i;
                    found = true;
                    int j;
                    for (j = i + 1; j <= 60; j++) {
                        if (valid(j))
                            x = j;
                        else break;
                    }
                    if (x == i) sb.append(" " + i + ",");
                    else sb.append(" " + i + "-" + x + ",");
                    i = j;
                }
            }
            if (found)
                out.append(sb.substring(0, sb.length() - 1));
            else out.append(" No acceptable speeds.");
            out.append('\n');
        }
        out.flush();
    }

    public static boolean valid(int v) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i][0] + arr[i][1] + arr[i][2];
            double t = (pos[i] * 3600) / v;
            double cur = t % sum;
            if (cur > (arr[i][0] + arr[i][1]))
                return false;
        }
        return true;
    }
}
