package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberUniqueIntegers {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: arr)
            map.put(x, map.getOrDefault(x, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while (k > 0) k -= pq.poll();
        return k < 0 ? pq.size() + 1: pq.size();
    }

    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }
}
