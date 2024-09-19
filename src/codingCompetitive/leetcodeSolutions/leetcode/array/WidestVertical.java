package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class WidestVertical {
    public int maxWidthOfVerticalArea(int[][] points) {
        int widest = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < points.length - 1; i++) {
            int wide = points[i + 1][0] - points[i][0];
            if (wide > widest) widest = wide;
        }
        return widest;
    }
}
