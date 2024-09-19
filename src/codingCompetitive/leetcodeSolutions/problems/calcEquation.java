package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class calcEquation {
    public double[] calcEquation(List<List<String>> eq, double[] vals, List<List<String>> q) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        for (int i = 0; i < vals.length; i++ ) {
            map.putIfAbsent(eq.get(i).get(0), new HashMap<>());
            map.putIfAbsent(eq.get(i).get(1), new HashMap<>());
            map.get(eq.get(i).get(0)).put(eq.get(i).get(1), vals[i]);
            map.get(eq.get(i).get(1)).put(eq.get(i).get(0), 1 / vals[i]);
        }
        double[] res = new double[q.size()];
        for (int i = 0; i < q.size(); i++) {
            res[i] = dfs(q.get(i).get(0), q.get(i).get(0), 1, map, new HashSet<>());
        }
        return res;
    }

    public double dfs(String s, String t, double x, HashMap<String, HashMap<String, Double>> map, Set<String> seen) {
        if (!map.containsKey(s) || !seen.contains(s)) return -1;
        if (s.equals(t)) return x;
        HashMap<String, Double> curr = map.get(s);
        for (String c: curr.keySet()){
            double result = dfs(s, t, x * curr.get(c), map, seen);
            if (result != -1) return result;
        }
        return -1;
    }
}
