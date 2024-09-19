package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Necklace {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.charAt(0) == '0' && s.charAt(2) == '0')
                break;
            String[] str = s.split(" ");
            int total = Integer.parseInt(str[0]);
            int v0 = Integer.parseInt(str[1]);
            int res = 0;
            if (total > v0) {
                double[] diam = new double[(int)Math.ceil(total / v0)];
                double max = 0.0;
                for (int i = 1; i < diam.length; i++) {
                    diam[i] = 0.3 * i * Math.sqrt(total / i - v0);
                    diam[i] = ((int)(diam[i] * 100000)) / 100000.0;
                    System.out.println(diam[i]);
                    if (diam[i] > max) max = diam[i];
                }
                int cnt = 0;
                for (double d : diam) if (max == d) cnt++;
                if (cnt == 1) {
                    for (int i = 1 ; i < diam.length; i++)
                        if (max == diam[i]) res = i;
                }
            }
            System.out.println(res);

        }
    }
}
