package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PlayMagic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            int t = Integer.parseInt(s);
            int idx = -1;
            String[] str = new String[t];
            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String value = st.nextToken();
                int suit = st.nextToken().length();
                while (suit --> 0) {
                    idx++;
                    idx = idx % t;
                    while (str[idx] != null) {
                        idx++;
                        idx = idx % t;
                    }
                }
                str[idx] = value;
            }
            pr.append(str[0]);
            for (int i = 1; i < str.length; i++)
                pr.append(" ").append(str[i]);
            pr.append("\n");
        }
        pr.flush();
    }
}
