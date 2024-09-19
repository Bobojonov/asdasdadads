package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bricks {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> w: wall) {
            int sum = 0;
            for (int i = 0; i < w.size() - 1; i++) {
                sum += w.get(i);
                if (map.containsKey(sum))
                    map.put(sum, map.get(sum) + 1);
                else
                    map.put(sum, 1);
            }
        }
        int res = wall.size();
        for (int k: map.keySet()) {
            res = Math.min(res, wall.size() - map.get(k));
        }
        return res;
    }
}
