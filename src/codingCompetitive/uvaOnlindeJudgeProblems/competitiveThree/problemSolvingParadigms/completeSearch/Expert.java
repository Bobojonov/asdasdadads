package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.problemSolvingParadigms.completeSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Expert {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++){
            int d = Integer.parseInt(br.readLine());
            String[] name = new String[d];
            int[] lowest = new int[d];
            int[] highest = new int[d];
            for (int i = 0; i < d; i++) {
                String[] str = br.readLine().split(" ");
                String s = str[0];
                int l = Integer.parseInt(str[1]);
                int h = Integer.parseInt(str[2]);
                name[i] = s;
                lowest[i] = l;
                highest[i] = h;

            }
            int p = Integer.parseInt(br.readLine());
            for (int i = 0; i < p; i++) {
                int price = Integer.parseInt(br.readLine());
                int cnt = 0, index = 0;
                for (int j = 0; j < d; j++) {
                    if (lowest[j] <= price && highest[j] >= price) {
                        cnt++;
                        index = j;
                        if (cnt > 1) break;
                    }
                }
                if (cnt == 1) System.out.println(name[index]);
                else System.out.println("UNDETERMINED");
            }
            if (t < n - 1) System.out.println();
        }
    }
}
