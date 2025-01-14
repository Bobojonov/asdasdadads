package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;

public class rankTeamsByVotes {

    public static String rankTeams(String[] votes) {
        int n = votes[0].length();
        int[][] map = new int[26][n + 1];
        for (int i = 0; i < 26; i++) map[i][n] = i;
        for (int i = 0; i < votes.length; i++) {
            String s = votes[i];
            for (int j = 0; j < s.length(); j++) {
                map[s.charAt(j) - 'A'][j]++;
            }
        }
        Arrays.sort(map, (a, b) ->{
            for(int i = 0; i < n; i++){
                System.out.println(a[i] + " " + b[i]);
                if(a[i] < b[i]) return 1;
                if(a[i] > b[i]) return -1;
            }
            return 0;
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append((char)('A' + map[i][n]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] vote = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println(rankTeams(vote));
    }
}
