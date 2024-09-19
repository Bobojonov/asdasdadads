package codingCompetitive.leetcodeSolutions.problems;


import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        boolean f = false;
        Queue<TreeNode> node = new LinkedList<>();
        node.offer(root);
        while (!node.isEmpty()) {
            TreeNode n = node.poll();
            if (n == null)
                f = true;
            else {
                if (f)
                    return false;
                node.offer(n.left);
                node.offer(n.right);
            }
        }
        return true;
    }
}
