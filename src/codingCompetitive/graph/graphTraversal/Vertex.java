package codingCompetitive.graph.graphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vertex {

    public static boolean [][] vertex;
    public static boolean [] visited;

    public static void traverse(int start) {
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[start][i] && !visited[i]) {
                visited[i] = true;
                traverse(i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            if (n == 0) break;
            vertex = new boolean[n][n];
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int src = Integer.parseInt(st.nextToken()) - 1;
                if (src == -1) break;
                while (st.hasMoreTokens()) {
                    int dest = Integer.parseInt(st.nextToken()) - 1;
                    if (dest == -1) break;
                    vertex[src][dest] = true;
                }
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            for (int i = 0; i < check; i++) {
                int toCheck = Integer.parseInt(st.nextToken()) - 1;
                visited = new boolean[n];
                traverse(toCheck);
                int[] inaccesible = new int[n + 1];
                for (int j = 0; j < n; j++) {
                    if (!visited[j]) inaccesible[++inaccesible[0]] = j + 1;
                }

                for (int j = 0; j <= inaccesible[0]; j++) {
                    System.out.print(inaccesible[j]);
                    if (j < inaccesible[0])
                        System.out.print(' ');
                }
                System.out.println();
            }
        }
    }
}
