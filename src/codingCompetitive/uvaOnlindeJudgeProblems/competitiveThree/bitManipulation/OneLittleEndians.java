package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneLittleEndians {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int n =  Integer.parseInt(s);
            int res = 0;
//            for (int i = 0; i < 4; i++) {
//                res = (res << 8)|((n >> (8 * i)) & 255);
//            }
            System.out.println(n + " converts to " + Integer.reverseBytes(n));
        }
    }


}
