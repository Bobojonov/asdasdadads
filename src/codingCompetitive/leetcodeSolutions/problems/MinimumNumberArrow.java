package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberArrow {

    public int findMinArrowShots(int[][] points) {
       if (points.length <= 1) return points.length;
       Arrays.sort(points, new Comparator<int[]>() {
           @Override
           public int compare(int[] p1, int[] p2) {
               if (p1[0] < p2[0])
                   return -1;
               if (p1[0] > p2[0])
                   return 1;
               return 0;
           }
       });
        for (int i = 0; i < points.length; i++)
            System.out.println(Arrays.toString(points[i]));
        int[] overlap = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int cnt = 0;
        for (int[] point: points) {
            overlap[0] = point[0];
            if (point[0] > overlap[1]) {
                overlap[1] = point[1];
                cnt++;
            } else overlap[1] = Math.min(point[1], overlap[1]);
        }
        return cnt;

    }
}
