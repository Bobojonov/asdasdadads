package codingCompetitive.interviewBit;

import java.util.*;

public class majorityElement {
    public int majorityElement(final int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        int comparator = (int) (Math.floor(A.length / 2));
        for (int num: A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() >= comparator)
                return entry.getKey();
        }
        return -1;
    }
}
