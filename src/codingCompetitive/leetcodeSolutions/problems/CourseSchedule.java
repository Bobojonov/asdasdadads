package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[5001];
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; ++i) graph[i] = new ArrayList<>();

        ArrayList<Integer> bfs = new ArrayList<>();
        int[] degree = new int[numCourses];
        for (int[] p : prerequisites) {
            graph[p[1]].add(p[0]);
            degree[p[0]]++;
        }
        System.out.println(Arrays.toString(graph));
        for (int i = 0; i < numCourses; i++)
            if (degree[i] == 0) bfs.add(i);
        for (int i = 0; i < bfs.size(); i++) {
            for (int j : graph[bfs.get(i)])
                if (degree[i]-- == 0) bfs.add(j);
        }
        return numCourses == bfs.size();
    }

    public static void main(String[] args) {
        System.out.println(canFinish(5, new int[][] {{1, 4}, {2, 4}, {3, 1}, {3, 2}}));
    }
}
