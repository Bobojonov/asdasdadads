package codingCompetitive.leetcodeSolutions.problems;

import java.util.LinkedList;
import java.util.List;

public class PathSumII {
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

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> curr = new LinkedList<>();
        sum(root, targetSum, curr, res);
        return res;
    }

    public void sum(TreeNode root, int sum, List<Integer> curr, List<List<Integer>> res) {
        if (root == null) return;
        curr.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new LinkedList<>(curr));
            curr.remove(curr.size() - 1);
            return;
        } else {
            sum(root.left, sum - root.val, curr, res);
            sum(root.right, sum - root.val, curr, res);
        }
        curr.remove(curr.size() - 1);
    }
}
