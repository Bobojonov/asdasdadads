package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumAreaRectangle {

    public int minimumAreaRectangle(int[][] points) {
        if (points.length < 4) return 0;
        int min_area = Integer.MAX_VALUE;
        Map<Integer, Set<String>> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int[] x = points[i];
            for (int j = i + 1; j < points.length; j++) {
                int[] y = points[j];
                if (x[0] == y[0] || x[1] == y[1]) continue;
                int x_distance = Math.abs(x[0] - y[0]);
                int y_distance = Math.abs(x[1] - y[1]);
                int distance   = x_distance * x_distance + y_distance * y_distance;
                if (map.containsKey(distance)) {
                    String x1 = x[0] + ":" + y[1];
                    String x2 = y[0] + ":" + x[1];
                    Set<String> prev = map.get(distance);
                    if (prev.contains(x1) && prev.contains(x2)) {
                        int area = x_distance * y_distance;
                        min_area = Math.min(min_area, area);
                    }
                }
                map.putIfAbsent(distance, new HashSet<>());
                map.get(distance).add(x[0] + ":" + x[1]);
                map.get(distance).add(y[0] + ":" + y[1]);
            }

        }
        return min_area != Integer.MAX_VALUE ? min_area : 0;
    }
}
