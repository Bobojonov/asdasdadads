package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.*;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String res = "";
        for (int i = 0; i < results.size(); i++) {
            int point = results.get(i);
            String winner = competitions.get(i).get(point == 0 ? 1 : 0);
            int score = map.getOrDefault(winner, 0) + 3;
            map.put(winner, score);
            if (max < score) {
                max = score;
                res = winner;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
    }
}
