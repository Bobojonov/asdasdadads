package codingCompetitive.leetcodeSolutions.algoAndDs.graphs;

import codingCompetitive.leetcodeSolutions.algoAndDs.ds.graph.Edge;
import codingCompetitive.leetcodeSolutions.algoAndDs.ds.graph.WeightedGraph;

import java.util.*;

public class Dijsktra {

    Map<Integer, Double> distance;
    private WeightedGraph graph;

    public Dijsktra(WeightedGraph graph) {
        this.graph = graph;
        distance = new HashMap<>();
    }

    /**
     * This is naive implementation of Dijsktra shortest path algorithm. Running time is O(VE);
     *  this implementation works best with dense graphs
     * */
    public void shortestPath(Integer source) {

        Set<Integer> openSet = new TreeSet<>();
        for (Integer vertex : graph.getVertices()) {
            if (source.equals(vertex)) distance.put(source, 0d);
            else distance.put(vertex, Double.POSITIVE_INFINITY);
            openSet.add(vertex);
        }
        while (!openSet.isEmpty()) {

            Integer min = 0;
            double minDis = Double.POSITIVE_INFINITY;
            for (Integer vertex : openSet) {
                if (minDis > distance.get(vertex)) {
                    minDis = distance.get(vertex);
                    min = vertex;
                }
            }

            openSet.remove(min);

            for (Edge edge : graph.getEdges(min)) {

                Double newPath = distance.get(min) + edge.getWeight();
                if (distance.get(edge.getTo()) > newPath) {
                    distance.put(edge.getTo(), newPath);
                }
            }
        }
    }

    /**
     * This is optimized version of shortest path algorithm, whose running time is O(E logE)
     * this works better than other implementations in practise
     * */
    public void shortestPathOptimized(Integer source) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        Map<Integer, Pair> map = new HashMap<>();
        for (Integer vertex : graph.getVertices()) {
            Pair pair;
            if (source.equals(vertex)) pair = new Pair(vertex, 0d);
            else pair = new Pair(vertex, Double.POSITIVE_INFINITY);
            queue.add(pair);
            map.put(vertex, pair);
        }
        while (!queue.isEmpty()) {

            Pair pair = queue.remove();

            if (map.get(pair.label) != pair) continue; // if pair is already updated

            for (Edge edge : graph.getEdges(pair.label)) {
                Double newPath = pair.weight + edge.getWeight();
                if (newPath < map.get(edge.getTo()).weight) {
                    Pair newPair = new Pair(edge.getTo(), newPath);
                    map.put(edge.getTo(), newPair);
                    queue.add(newPair);
                }
            }
        }


    }

    private class Pair implements Comparable<Pair> {
        Integer label;
        Double weight;

        public Pair(Integer name, Double weight) {
            this.label = name;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair p) {
            return (int) (this.weight - p.weight);
        }
    }
}
