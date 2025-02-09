package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBinaryTree {

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

    public static List<Double> averageOfLevels(TreeNode root) {
        List <Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue <TreeNode> temp = new LinkedList<>();
            System.out.println("**");
            while (!queue.isEmpty()) {
                TreeNode n = queue.remove();
                sum += n.val;
                System.out.println(sum);
                count++;
                if (n.left != null)  temp.add(n.left);
                if (n.right != null) temp.add(n.right);
            }
            queue = temp;
            res.add(sum * 1.0 / count);
        }
        return res;
    }

    public static void main(String[] args) {
    }


}
