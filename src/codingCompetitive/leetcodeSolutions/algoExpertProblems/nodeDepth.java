package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class nodeDepth {
    static int sum = 0;
    public static int nodeDepths(BinaryTree root) {
        findMaxSum(root,0);
        return sum;
    }
    static void findMaxSum(BinaryTree node, int count) {
        sum += count;
        if (node.left != null)
            findMaxSum(node.left, count + 1);
        if (node.right != null)
            findMaxSum(node.right, count + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {

    }
}
