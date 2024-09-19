package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.problemSolvingParadigms.completeSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuirksomeSquares {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            int digit = Integer.parseInt(s);
            int half = (int)Math.pow(10, digit / 2);
            for (int i = 0; i < half; i++) {
                int n = i * i;
                if (Math.pow(n / half + n % half, 2) == n)
                    System.out.printf("%0" + digit + "d\n", n);
            }
        }
    }
}
