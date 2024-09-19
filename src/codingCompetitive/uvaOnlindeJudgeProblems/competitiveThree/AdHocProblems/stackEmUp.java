package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class stackEmUp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        int testCases = n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < value.length; j++) {
                sb = new StringBuilder();
                sb.append(value[j]);
                sb.append(" of ");
                sb.append(suit[i]);
                deck[i * value.length + j] = sb.toString();
            }
        }
        br.readLine();
        for (int cases = 1; cases <= n; cases++){
            StringTokenizer st = new StringTokenizer("");
            int t = Integer.parseInt(br.readLine());
            int[][] shuffle = new int[t][52];
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 52; j++) {
                    if (!st.hasMoreTokens())
                        st = new StringTokenizer(br.readLine());
                    shuffle[i][j] = Integer.parseInt(st.nextToken()) - 1;
                }
            }
            String s;
            String[] currDeck = Arrays.copyOf(deck, deck.length);
            while (true) {
                s = br.readLine();
                if (s == null || s.equals(""))
                    break;
                int k = Integer.parseInt(s) - 1;
                String[] newDeck = new String[52];
                for (int i = 0; i < 52; i++) {
                    newDeck[i] = currDeck[shuffle[k][i]];
                }
                currDeck = newDeck;
            }
            sb = new StringBuilder();
            for (int i = 0; i < currDeck.length; i++) {
                sb.append(currDeck[i]);
                sb.append("\n");
            }
            if (cases < n)
                sb.append("\n");
            System.out.print(sb);
        }
    }

    /*
2 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 52 51
52 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 1
     */
}
