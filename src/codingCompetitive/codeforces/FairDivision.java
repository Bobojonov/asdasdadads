package codingCompetitive.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FairDivision {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            int c1 = 0, c2 = 0;
            String[] s = br.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) == 1) c1++;
                else c2++;
            }
//            if ((c1 + 2 * c2) % 2 != 0) System.out.println("NO");
//            else if ()
        }
    }

}
