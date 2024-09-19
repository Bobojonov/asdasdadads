package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkylineProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] skyline = new int[10001];
        int f = 1;
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            String[] str = s.split(" ");
            int l = Integer.parseInt(str[0]);
            int h = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            for (int i = l; i < r; i++) {
                if (skyline[i] < h)
                    skyline[i] = h;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (skyline[i] != skyline[i - 1]) {
                if (f == 1){
                    System.out.print(i + " " + skyline[i]);
                    f++;
                } else System.out.print(" " + i + " " + skyline[i]);
            }
        }
        System.out.println();
    }
}
