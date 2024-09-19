package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.LinearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class HeadJudgeHeadache {
    static class Teams {
        int team;
        int solved;
        int time;
        public Teams(int team, int solved, int time) {
            this.team = team;
            this.solved = solved;
            this.time = time;
        }
    }

    static class TeamsComparator implements Comparator<Teams> {

        @Override
        public int compare(Teams o1, Teams o2) {
            if (o1.solved < o2.solved) return 1;
            if (o1.solved == o2.solved) {
                if (o1.team < o2.team) return 1;
                else return 0;
            }
            return -1;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Teams> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> penalty = new HashMap<>();
        Map<Integer, Integer> solved = new HashMap<>();
        while (true) {
            String s;
            if ((s = br.readLine()) != null && s.length() != 0) {
                String[] field = s.split(" ");
                int team = Integer.parseInt(field[0]);
                String[] t = field[2].split(":");
                if (field[3].equals("Y")) {
                    int minutes = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
                    int time = minutes + penalty.getOrDefault(team, 0);
                    penalty.put(team, 0);
                    map.put(team, map.getOrDefault(team, 0) + time);
                    solved.put(team, solved.getOrDefault(team, 0) + 1);
                } else {
                    map.put(team, map.getOrDefault(team, 0));
                    penalty.put(team, 20);
                    solved.put(team, solved.getOrDefault(team, 0));
                }
            }
            else break;
        }
        for (int i = 1; i <= 25; i++) {
            if (map.containsKey(i)) {
                Teams team = new Teams(i, solved.get(i), map.get(i));

                list.add(team);
            }
        }
        list.sort(new TeamsComparator());
        for (Teams team: list)
            System.out.println(team.team + " " + team.solved + " " + team.time);
    }
}
