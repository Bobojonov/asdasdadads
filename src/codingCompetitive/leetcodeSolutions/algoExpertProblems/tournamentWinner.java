package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class tournamentWinner {
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> total = new HashMap<>();
        int max = 0;
        String winner = "";
        for (int i = 0; i < results.size(); i++) {
            int point = results.get(i);
            String awayOrHome = competitions.get(i).get(point == 0 ? 1 : 0);
            int score = total.getOrDefault(awayOrHome, 0) + 3;
            if (max < score){
                max = score;
                winner = awayOrHome;
            }
            total.put(awayOrHome, score);
        }
        return winner;
    }
    public static void main(String[] args) {


    }
}
