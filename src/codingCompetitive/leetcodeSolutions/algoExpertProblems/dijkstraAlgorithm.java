package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.*;

public class dijkstraAlgorithm {

    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        int[] result = new int[edges.length];
        Arrays.fill(result, -1);
        PriorityQueue<Item> q = new PriorityQueue<>(Comparator.comparingInt(o -> (o.totalDistance)));
        HashSet<Integer> visited = new HashSet<>();
        for (int[] edge: edges[start]){
            q.offer(new Item(edge[0], edge[1], edge[1]));
        }
        result[start] = 0;
        visited.add(start);
        while (visited.size() < edges.length && !q.isEmpty()){
            Item nextNode = q.poll();
            if (visited.contains(nextNode.id)) continue;
            visited.add(nextNode.id);
            result[nextNode.id] = nextNode.totalDistance;
            for (int[] edge: edges[nextNode.id]) {
                if (!visited.contains(edge[0]))
                    q.offer(new Item(edge[0], edge[1] + nextNode.totalDistance, edge[1]));
            }
        }
        return result;
    }

    public static class Item {
        public int id;
        public int totalDistance;
        public int distance;
        public Item(int id, int totalDistance, int distance){
            this.id = id;
            this.totalDistance = totalDistance;
            this.distance = distance;
        }
    }

}
