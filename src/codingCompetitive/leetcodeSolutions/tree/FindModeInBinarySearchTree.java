package codingCompetitive.leetcodeSolutions.tree;


import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree {
    int max = 0;
    int cnt = 1;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        helper(root.left, list);
        if (prev != null) {
            if (prev == root.val) cnt++;
            else cnt = 1;
        }
        if (cnt > max) {
            max = cnt;
            list.clear();
            list.add(root.val);
        } else if (cnt == max) list.add(root.val);
        prev = root.val;
        helper(root.right, list);
    }
}
