package codingCompetitive.leetcodeSolutions.tree;

public class MinAbsoluteDiffInBST {

    Integer prev = null;
    int diff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return diff;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (prev != null) diff = Math.min(diff, root.val - prev);
        prev = root.val;
        helper(root.right);
    }
}
