package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithMoreOnesThanZeros {

    public static int subarraysWithMoreZerosThanOnes(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int mod = 1000000007;
        int[] prefix = new int[n];
        int sum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (!map.containsKey(sum)) {
                if (nums[i] == 1) {
                    prefix[i] = i + 1;
                    if (sum == 0) prefix[i] -= 1;
                }
            }
            else {
                prefix[i] = prefix[map.get(sum)];
                if (nums[i] == 1) prefix[i] += i - (map.get(sum) + 1);
            }
            map.put(sum, i);
            res = (res + prefix[i]) % mod;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(subarraysWithMoreZerosThanOnes(new int[] {
                0,1,1,0,1
        }));
    }
}
