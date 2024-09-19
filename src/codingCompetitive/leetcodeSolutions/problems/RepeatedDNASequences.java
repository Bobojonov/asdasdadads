package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 10) return res;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 10; i++) {
            int j = i + 10;
            String sub = s.substring(i, j);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet())
            if (entry.getValue() > 1)
                res.add(entry.getKey());
        return res;
    }
}
