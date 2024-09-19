package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class texQuotes {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int cnt = 1;
        while ((str = in.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '"') {
                    if (cnt % 2 == 1) System.out.print("``");
                    else System.out.print("''");
                    cnt++;
                }
                else System.out.print(str.charAt(i));
            }
            System.out.println("");
        }

    }
}
