package codingCompetitive.leetcodeSolutions.algoAndDs.easy;

import java.util.LinkedList;

public class MaximumDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> st = new LinkedList<>();
        LinkedList<Integer> depth = new LinkedList<>();
        if (root == null) return 0;
        st.add(root);
        depth.add(1);
        int cnt = 0, curr = 0;
        while(!st.isEmpty()) {
            root = st.pollLast();
            curr = depth.pollLast();
            if (root != null) {
                cnt = Math.max(cnt, curr);
                st.add(root.left);
                st.add(root.right);
                depth.add(curr + 1);
                depth.add(curr + 1);
            }
        }
        return cnt;
    }
}
