package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class TopKFrequentElementsInList {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        if (Objects.equals(o1.getValue(), o2.getValue())) return o2.getKey() - o1.getKey();
                        else return o2.getValue() - o1.getValue();
                    }
                });
        int[] res = new int[k + 1];
        for (int i = 0; i <= k; i++)
            res[i] = list.get(i).getKey();
        return res;
    }
}
