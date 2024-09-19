package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionsAgain {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            int k = Integer.parseInt(s);
            int cnt = 0;
            String[] sb = new String[2 * k];
            int j = 0;
            for (int i = 1; i <= 2 * k; i++) {
                if (i > k) if ((i * k) % (i - k) == 0) {
                    int y = i * k / (i - k);
                    String equation = "1/" + String.valueOf(k) + " = " + "1/" + String.valueOf(y) + " + " + "1/" + String.valueOf(i);
                    sb[j++] = equation;
                    cnt++;
                }
            }
            System.out.println(cnt);
            for (int i = 0; i < cnt; i++)
                System.out.println(sb[i]);
        }
    }
}
