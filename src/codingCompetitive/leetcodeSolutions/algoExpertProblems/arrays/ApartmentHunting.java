package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ApartmentHunting {
    static int[] min_distance;
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        min_distance = new int[blocks.size()];
        for (String req: reqs) {
            int[] values = values = minDistance(blocks, req);
            compare(min_distance, values);
        }
        int min_id = 0;
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.size(); i++) {
            int value = min_distance[i];
            if (value < min_value) {
                min_id = i;
                min_value = value;
            }
        }
        return min_id;
    }
    static void compare(int[] min_distance, int[] values) {
        for (int i = 0; i < min_distance.length; i++)
            min_distance[i] = Math.max(min_distance[i], values[i]);
    }

    static int[] minDistance(List<Map<String, Boolean>> blocks, String req) {
        int[] distance = new int[blocks.size()];
        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).get(req)) closest = i;
            distance[i] = Math.abs(i - closest);
        }
        for (int i = blocks.size() - 1; i >= 0; i--) {
            if (blocks.get(i).get(req)) closest = i;
            distance[i] = Math.min(distance[i], Math.abs(i - closest));
        }
        return distance;

    }
}
