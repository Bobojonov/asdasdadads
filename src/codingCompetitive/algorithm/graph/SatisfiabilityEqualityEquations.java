package codingCompetitive.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SatisfiabilityEqualityEquations {
    public static boolean equationsPossible(String[] equations) {
        List<Integer>[] graph = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            graph[i] = new ArrayList<>();
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                int x = equation.charAt(0) - 'a';
                int y = equation.charAt(3) - 'a';
                graph[x].add(y);
                graph[y].add(x);
            }
        }
        int[] color = new int[26];
        Arrays.fill(color, -1);
        for (int i = 0; i < 26 ; i++) {
            if (color[i] == -1) dfs(i, i, color, graph);
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                int x = equation.charAt(0) - 'a';
                int y = equation.charAt(3) - 'a';
                if (color[x] == color[y]) return false;
            }
        }
        return true;
    }

    public static void dfs(int r, int c, int[] color, List<Integer>[] graph) {
        if (color[r] == -1) {
            color[r] = c;
            for (int x: graph[r])
                dfs(x, c, color, graph);
        }
    }
    public static void main(String[] args) {
        String[] equations = {"a==b","b==a"};
        equationsPossible(equations);
    }
}
