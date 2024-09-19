package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class skylineProblem {
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();
        for (int[] b: buildings) {
            heights.add(new int[]{b[0], -b[2]});
            heights.add(new int[]{b[1], b[2]});
        }
        Collections.sort(heights, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.offer(0);
        int prev = 0;
        for (int[] h: heights) {
            if (h[1] < 0) pq.offer(-h[1]);
            else pq.remove(h[1]);
            int curr = pq.peek();
            if (prev != curr) {
                List<Integer> sublist = new ArrayList<>();
                sublist.add(h[0]);
                sublist.add(curr);
                result.add(new ArrayList<>(sublist));
                prev = curr;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[][] buildings = {
                {2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}
        };
        System.out.println(getSkyline(buildings));
    }
}
