package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class SubarraySumsDivisible {

    public int subarrayDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cnt = 0, sum = 0;
        for (int n: nums) {
            sum = (sum + n) % k;
            if (sum < 0) sum += k;
            cnt += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
