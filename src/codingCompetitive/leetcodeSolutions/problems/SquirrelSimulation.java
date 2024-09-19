package codingCompetitive.leetcodeSolutions.problems;

public class SquirrelSimulation {

    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int total = 0, dist = Integer.MIN_VALUE;
        for (int[] nut: nuts) {
            total += (bestDistance(nut, tree) * 2);
            dist = Math.max(dist, bestDistance(nut, tree) - bestDistance(nut, squirrel));
        }
        return total - dist;
    }

    public int bestDistance(int[] x, int[] y) {
        return Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
    }
}
