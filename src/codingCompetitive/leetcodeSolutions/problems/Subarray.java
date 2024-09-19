package codingCompetitive.leetcodeSolutions.problems;

import java.util.List;
import java.util.Stack;

public class Subarray {
    public static void main(String[] args) {
        int[] nums = {103, 773};
        System.out.println(sub(nums, 40));
    }

    public static int sub(int[] nums, int k) {
        int res = 0, p;
        for (int i = 0; i < nums.length; i++) {
            p = 1;
            for (int j = i; j < nums.length; j++) {
                int gcd = lcm(p, nums[j]);
                p = (p * nums[j]) / gcd;
                if (p == k) res += 1;
            }
        }
        return res;
    }

    public static int lcm(int a, int b) {
        if (b == 0) return a;
        return lcm(b, a % b);
    }
}
