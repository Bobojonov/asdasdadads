package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeOverlappingIntervals {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt((a -> a[0])));
        int idx = 0;
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            System.out.println(result.get(idx)[0] + " " + result.get(idx)[1]);
            if (result.get(idx)[1] >= intervals[i][0])
                result.set(idx, new int[] {result.get(idx)[0], Math.max(result.get(idx)[1], intervals[i][1])});
            else {
                idx++;
                result.add(new int[] {intervals[i][0], intervals[i][1]});
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        System.out.println(mergeOverlappingIntervals(intervals));
    }

}
