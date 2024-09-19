package codingCompetitive.leetcodeSolutions.problems;

import java.util.PriorityQueue;

public class ApplyOperations {

    public static int applyOperations(int[] costs, int k, int candidates) {
        int l = 0, r = costs.length - 1, sum = 0;
        PriorityQueue<Integer> pqL = new PriorityQueue<>();
        PriorityQueue<Integer> pqR = new PriorityQueue<>();
        while (k > 0) {
            while (pqL.size() < candidates && l <= r) pqL.add(costs[l++]);
            while (pqR.size() < candidates && r >= l) pqL.add(costs[r--]);
            System.out.println(pqL + "    " +  pqR);
            int l_min = pqL.size() > 0 ? pqL.peek() : Integer.MAX_VALUE;
            int r_min = pqR.size() > 0 ? pqR.peek() : Integer.MAX_VALUE;
            k--;
            if (l_min <= r_min) {
                sum += l_min;
                pqL.poll();
            } else {
                sum += r_min;
                pqR.poll();
            }
        }
        System.out.println(pqL + "    " +  pqR);
        return sum;
    }

    public static void main(String[] args) {
        int[] costs = {1, 2, 4, 1};
        int k = 3;
        int candidates = 3;
        System.out.println(applyOperations(costs, k, candidates));

    }
}
