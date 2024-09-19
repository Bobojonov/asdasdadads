package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BridgeHands {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> suit = new HashMap<>();
        Map<Integer, Character> suitOut = new HashMap<>();
        Map<Character, Integer> conversion = new HashMap<>();
        Map<Integer, Character> out = new HashMap<>();
        Map<Character, Integer> clock = new HashMap<>();
        clock.put('E', 0);
        clock.put('S', 1);
        clock.put('W', 2);
        clock.put('N', 3);
        suit.put('C', 0);
        suitOut.put(0, 'C');
        suit.put('D', 1);
        suitOut.put(1, 'D');
        suit.put('S', 2);
        suitOut.put(2, 'S');
        suit.put('H', 3);
        suitOut.put(3, 'H');
        char dealer;
        for (int i = 2; i <= 9; i++){
            char key = Character.forDigit(i, 10);
            conversion.put(key, i - 2);
            out.put(i - 2, key);
        }
        out.put(8, 'T');
        out.put(9, 'J');
        out.put(10, 'Q');
        out.put(11, 'K');
        out.put(12, 'A');
        conversion.put('T', 8);
        conversion.put('J', 9);
        conversion.put('Q', 10);
        conversion.put('K', 11);
        conversion.put('A', 12);
        while (true) {
            dealer = br.readLine().charAt(0);
            if (dealer == '#') break;
            boolean[][][] cards = new boolean[4][4][13];
            String s1 = br.readLine();
            String s2 = br.readLine();
            String s = s1 + s2;
            int starter = clock.get(dealer);
            for (int i = 0; i < 103; i+= 2) {
                char cardSuit = s.charAt(i);
                char value = s.charAt(i + 1);
                cards[starter][suit.get(cardSuit)][conversion.get(value)] = true;
                starter = (starter + 1) % 4;
            }
            char[] compass = new char[4];
            compass[0] = 'S';
            compass[1] = 'W';
            compass[2] = 'N';
            compass[3] = 'E';
            for (int i = 0; i < 4; i++) {
                System.out.print(compass[i] + ":");
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 13; k++) {
                        if (cards[i][j][k])
                            System.out.print(" " + suitOut.get(j) + out.get(k));
                    }
                }
                System.out.println();
            }
        }
    }
}
