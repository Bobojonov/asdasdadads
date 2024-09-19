package codingCompetitive.leetcodeSolutions.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxPointsLine {

    public int maxPoints(int[][] points) {
        int res = 2;
        for (int i = 0; i < points.length; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                map.compute(((double)(points[i][1] - points[j][1])) / (points[i][0] - points[j][0]),
                        (key, value) -> value == null ? 2 : value + 1);
            }
            res = Math.max(res, map.values().stream().max(Comparator.comparingDouble(value -> value)).orElse(0));
        }
        return res;
    }
}
