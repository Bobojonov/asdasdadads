package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LineThroughPoints {
    public int lineTroughPoints(int[][] points) {

        int res = 1;

        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                map.compute(((double)(points[i][1] - points[j][1])) / (points[i][0] - points[j][0]),
                        (key, value) -> value == null ? 2 : value + 1);
                System.out.println(map);
            }
            res = Math.max(res, map.values().stream().max(Comparator.comparingDouble(v -> v)).orElse(0));
        }
        return res;
    }

    public static void main(String[] args) {
//        int[][] n = new int[][]{
//
//        }
    }
}
