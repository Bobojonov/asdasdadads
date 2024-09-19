package codingCompetitive.leetcodeSolutions.algoAndDs.ds.graph;

import java.util.Objects;

public class Edge implements Comparable<Edge> {
    private Double weight;
    private Integer from;
    private Integer to;

    public Edge(Double weight) {
        this.weight = weight;
    }

    public Edge(Integer from, Integer to, Double weight) {
        this.weight = weight;
        this.from   = from;
        this.to     = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        if (!Objects.equals(weight, edge.weight)) return false;
        if (!Objects.equals(from, edge.from)) return false;
        return Objects.equals(to, edge.to);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public int hashCode() {
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    @Override
    public int compareTo(Edge o) {
        return (int) (this.weight - o.weight);
    }
}
