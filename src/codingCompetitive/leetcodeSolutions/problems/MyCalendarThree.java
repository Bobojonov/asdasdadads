package codingCompetitive.leetcodeSolutions.problems;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendarThree {
    private Map<Integer, Integer> map;
    public MyCalendarThree() {
        map =  new TreeMap<>();
    }

    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int result = 0, curr = 0;
        for (int value: map.values()) {
            curr += value;
            result = Math.max(result, curr);
        }
        return result;
    }
}
