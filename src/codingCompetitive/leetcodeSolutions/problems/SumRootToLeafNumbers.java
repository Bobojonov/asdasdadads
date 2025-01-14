package codingCompetitive.leetcodeSolutions.problems;

public class SumRootToLeafNumbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int s) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return s * 10 + root.val;
        return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
    }
}
