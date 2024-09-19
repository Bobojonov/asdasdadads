package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soundex {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            int prev1 = -1, prev2;
            for (char ch: s.toCharArray()) {
                if (ch == 'B' || ch == 'F' || ch == 'P' || ch == 'V') prev2 = 1;
                else if (ch == 'C' || ch == 'G' || ch == 'J' || ch == 'K' || ch == 'Q' || ch == 'S' ||
                        ch == 'X' || ch == 'Z') prev2 = 2;
                else if (ch == 'D' || ch == 'T') prev2 = 3;
                else if (ch == 'L') prev2 = 4;
                else if (ch == 'M' || ch == 'N') prev2 = 5;
                else if (ch == 'R') prev2 = 6;
                else prev2 = -1;
                if (prev2 != -1 && prev1 != prev2) System.out.print(prev2);
                prev1 = prev2;
            }
            System.out.println();
        }
    }


}
