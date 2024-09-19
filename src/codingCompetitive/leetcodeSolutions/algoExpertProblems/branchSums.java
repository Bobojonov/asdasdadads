package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.List;

public class branchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> branchSum = new ArrayList<>();
        calculateBranchSum(root, 0, branchSum);

        return branchSum;
    }
    public static ArrayList<Integer> calculateBranchSum(BinaryTree node, int runningSum, ArrayList<Integer> sums) {
        if (node == null)
            return sums;
        int sum = runningSum + node.value;
        if (node.left == null && node.right == null){
            sums.add(sum);
            return sums;
        }
        calculateBranchSum(node.left, sum, sums);
        calculateBranchSum(node.right, sum, sums);
        return sums;
    }
    public static void main(String[] args) {

    }
}
