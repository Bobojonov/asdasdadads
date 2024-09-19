package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ZerosAndOnes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int cases = 1;
        while ((line = br.readLine()) != null) {
            System.out.println("Cases " + cases++ + ":");
            int n = Integer.parseInt(br.readLine());
            while (n --> 0) {
                boolean f = true;
                StringTokenizer st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());
                int min = Math.min(i, j);
                int max = Math.max(i, j);
                    for (int k = min; k < max; k++) {
                    if (line.charAt(k) != line.charAt(k + 1)) {
                        f = false;
                        break;
                    }
                }
                if (f) System.out.println("Yes");
                else System.out.println("No");
            }
        }

    }

}
