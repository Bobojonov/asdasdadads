package codingCompetitive.algorithm.graph;

import java.util.*;

public class CheapestFlightsWithinKStops {
    static int res;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        res = Integer.MAX_VALUE;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] f: flights) {
            map.putIfAbsent(f[0], new ArrayList<>());
            map.get(f[0]).add(new int[] {f[1], f[2]});
        }
        dfs(map, src, dst, k + 1, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public static void dfs(Map<Integer, List<int[]>> map, int src, int dst, int k, int price) {
        if (k < 0) return;
        if (src == dst) {
            res = price;
            return;
        }

        if (!map.containsKey(src)) return;
        for (int[] m: map.get(src)) {
            if (price + m[1] > res)
                continue;
            dfs(map, m[0], dst, k - 1, price + m[1]);
        }
    }
}
