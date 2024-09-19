package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class containDuplicates {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int x: nums)
            map.put(x, map.getOrDefault(x, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
//        Comparator((a, b) -> )
        return true;
    }
}
