package codingCompetitive.uvaOnlindeJudgeProblems.graphDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyDearNeighbours {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine());
            int[] neighbour = new int[p];
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < p; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                neighbour[j] = st.countTokens();
                min = Math.min(min, neighbour[j]);
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < p; j++)
                if (neighbour[j] == min) {
                    sb.append(j + 1);
                    sb.append(" ");
                }
            sb.setLength(sb.length() - 1);
            System.out.println(sb);
            br.readLine();
        }
    }
}
