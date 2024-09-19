package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class NewsPaper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.ISO_8859_1));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int k = Integer.parseInt(br.readLine());
            double[] value = new double[256];
            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                value[st.nextToken().charAt(0)] = Integer.parseInt(st.nextToken()) / 100.0;
            }
            int m = Integer.parseInt(br.readLine());
            double total = 0.0;
            for (int i = 0; i < m; i++) {
                for (char ch : br.readLine().toCharArray())
                    total += value[ch];
            }
            System.out.printf("%.2f$\n", total);
        }

    }
}
