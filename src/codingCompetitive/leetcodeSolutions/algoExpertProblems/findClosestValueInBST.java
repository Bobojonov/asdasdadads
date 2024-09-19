package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class findClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        int diff_nodes = Integer.MAX_VALUE;
        int closestValue = 0;
        while (tree != null) {
            if (tree.value == target) return tree.value;
            int diff = Math.abs(tree.value - target);
            if (diff < diff_nodes){
                closestValue = tree.value;
                diff_nodes = diff;
            }
            if (target < tree.value)
                tree = tree.left;
            else tree = tree.right;
        }
        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {

    }
}
