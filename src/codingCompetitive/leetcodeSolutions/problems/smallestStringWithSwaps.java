package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class smallestStringWithSwaps {
    final static int n = 100001;
    static boolean[] visited = new boolean[n];
    static List<Integer>[] adj = new ArrayList[n];

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        for (int i = 0; i < s.length(); i++) {
            adj[i] = new ArrayList<Integer>();
        }

        // Build the adjacency list
        for (List<Integer> edge : pairs) {
            int i = edge.get(0);
            int j = edge.get(1);

            // Undirected edge
            adj[i].add(j);
            adj[j].add(i);
        }
        char[] result = new char[s.length()];
        for (int vertex = 0; vertex < s.length(); vertex++){
            if (!visited[vertex]){
                System.out.println(visited[vertex] + " asdadas");
                List<Character> characters = new ArrayList<>();
                List<Integer> indices = new ArrayList<>();
                dfs(s, vertex, characters, indices);
                Collections.sort(characters);
                Collections.sort(indices);
                for (int idx = 0; idx < characters.size(); idx++)
                    result[indices.get(idx)] = characters.get(idx);
            }
            for (int i = 0; i < 10; i++)
                System.out.print(visited[i] + " ");
            System.out.println();
        }
        return new String(result);
    }

    public static void dfs(String s, int vertex, List<Character> characters, List<Integer> indices) {
        characters.add(s.charAt(vertex));
        indices.add(vertex);
        visited[vertex] = true;
        for (int adjasent: adj[vertex]) {
            if (!visited[adjasent])
                dfs(s, adjasent, characters, indices);
        }
    }
}
