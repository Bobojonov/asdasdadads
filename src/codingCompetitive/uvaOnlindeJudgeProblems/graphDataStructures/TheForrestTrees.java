package codingCompetitive.uvaOnlindeJudgeProblems.graphDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TheForrestTrees {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            boolean [][] edges=new boolean [26][26];
            String s;
            while ((s = br.readLine()).charAt(0) != '*') {
                edges[s.charAt(1) - 'A'][s.charAt(3) - 'A'] = true;
                edges[s.charAt(3) - 'A'][s.charAt(1) - 'A'] = true;
            }
            boolean [] points=new boolean [26];
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            while (st.hasMoreTokens()) points[st.nextToken().charAt(0) - 'A'] = true;
            int acrons = 0, treeCount = 0;
            boolean[] seen = new boolean[26];
            for (int i = 0; i< 26; i++) {
                if (points[i] && !seen[i]) {
                    int edgesCount = 0;
                    for (int j = 0; j < 26; j++) if (edges[i][j]) {
                        edgesCount++;
                    }
                    if (edgesCount == 0) {
                        seen[i] = true;
                        acrons++;
                    }
                    else {
                        boolean tree = true;
                        LinkedList<Integer> queue = new LinkedList<>();
                        queue.add(i);
                        boolean[][] edgesSeen = new boolean[26][26];
                        while (!queue.isEmpty()) {
                            int currI = queue.removeFirst();
                            if (seen[currI]) {
                                tree = false;
                                break;
                            }
                            else {
                                seen[currI] = true;
                                for (int j = 0; j < 26; j++) {
                                    if (edges[currI][j] && !edgesSeen[currI][j] && !edgesSeen[j][currI]) {
                                        queue.add(j);
                                        edgesSeen[currI][j] = true;
                                        edgesSeen[j][currI] = true;
                                    }
                                }
                            }
                        }
                        if (tree) treeCount++;
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            sb.append("There are ");
            sb.append(treeCount);
            sb.append(" tree(s) and ");
            sb.append(acrons);
            sb.append(" acorn(s).");
            System.out.println(sb);
        }
    }
}
