package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeOverlappingIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] interval: intervals) {
            if (list.isEmpty() || list.getLast()[1] < interval[0]) list.add(interval);
            else list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
        }
        return list.toArray(new int[list.size()][]);
    }
}
