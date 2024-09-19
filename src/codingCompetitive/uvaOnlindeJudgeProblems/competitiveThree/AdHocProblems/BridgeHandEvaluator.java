package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BridgeHandEvaluator {

    private static int points;
    private static Map<Character, Integer> suit;
    private static boolean[] ace, king, queen, jack, trump;
    private static int[] cnt;

    public static void helper(char c, int pos) {
        cnt[pos]++;
        if (c == 'A') {
            ace[pos] = true;
            points += 4;
            return;
        }
        if (c == 'K') {
            king[pos] = true;
            points += 3;
            return;
        }
        if (c == 'Q') {
            queen[pos] = true;
            points += 2;
            return;
        }
        if (c == 'J') {
            jack[pos] = true;
            points += 1;
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s;
        suit = new HashMap<>();
        suit.put('S', 0);
        suit.put('H', 1);
        suit.put('D', 2);
        suit.put('C', 3);
        ace   = new boolean[4];
        king  = new boolean[4];
        queen = new boolean[4];
        jack  = new boolean[4];
        trump = new boolean[4];
        char[] output = {'S', 'H', 'D', 'C'};
        int idx;
        cnt = new int[4];
        while (true) {
            s = sc.next();
            System.out.println(s.length());
            if (s == null) break;
            for (int i = 0; i < 13; i++) {
                if (i != 0) {
                    s = sc.next();
                }
                idx = suit.get(s.charAt(1));
                helper(s.charAt(0), idx);
            }

            for (int i = 0; i < 4; i++) {
                if(ace[i]) trump[i] = true;
                if (king[i] && cnt[i] <= 1) --points;
                else if (king[i]) trump[i] = true;
                if (queen[i] && cnt[i] <= 2) --points;
                else if (queen[i]) trump[i] = true;
                if (jack[i] && cnt[i] <= 3) --points;
                else if (jack[i]) trump[i] = true;
                if (cnt[i] == 2) points++;
                else if (cnt[i] <= 1) points += 2;
            }

            if (trump[0] && trump[1] && trump[2] && trump[3] && points >= 16)
                System.out.println("BID NO-TRUMP");
            else if (points >= 14) {
                char out = 'S';
                int mx = 0;
                for (int i = 1; i < 4; i++) {
                    if (cnt[i] > cnt[mx]) {
                        mx = i;
                        out = output[i];
                    }
                }
                System.out.println("BID " + out);
            }
            else System.out.println("PASS");
        }
        sc.close();
    }
}
