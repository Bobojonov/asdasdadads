package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPossibleBinaryTrees {

    public class TreeNode {
        int val ;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val   = val;
            this.left  = left;
            this.right = right;
        }
    }
    Map <Integer, List<TreeNode>> map = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n % 2 == 0) return res;
        if (map.get(n) == null) {
            if (n == 1) res.add(new TreeNode(0));
            else {
                for (int i = 1; i < n; i += 2) {
                    int j = n - i - 1;
                    List<TreeNode> left = allPossibleFBT(i);
                    List<TreeNode> right = allPossibleFBT(j);
                    for (TreeNode l: left) {
                        for (TreeNode r: right) {
                            TreeNode root = new TreeNode(0);
                            root.left = l;
                            root.right = r;
                            res.add(root);
                        }
                    }
                }
            }
            map.put(n, res);
        }
        return map.get(res);
    }
}
