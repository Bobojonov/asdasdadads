package codingCompetitive.leetcodeSolutions.problems;

import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i % n])
                st.pop();
            res[i % n] = st.isEmpty() ? -1 : nums[st.peek()];
            st.push(i % n);
        }
        return res;
    }
}
