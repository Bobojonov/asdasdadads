package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;

public class FindRightInterval {

    public int[] findRightInterval(int[][] intervals) {
        if (intervals.length <= 1) return new int[]{-1};
        HashMap<int[], Integer> map = new HashMap<>();
        int n = intervals.length;
        int[][] endIntervals = Arrays.copyOf(intervals, n);
        for (int i = 0; i < n; i++)
            map.put(intervals[i], i);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(endIntervals, (a, b) -> a[1] - b[1]);
        for (int i = 0; i < n; i++)
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.println(endIntervals[i][0] + " " + endIntervals[i][1]);
        System.out.println();
        int j = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(j);
            while (j < n && intervals[j][0] < endIntervals[i][1]) j++;
            res[map.get(endIntervals[i])] = j == intervals.length ? -1 : map.get(intervals[j]);
        }
        return res;
    }
}
