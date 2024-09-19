package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class validateBST {

    public static boolean validateBst(BST tree) {
        return checkTree(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkTree(BST node, int min, int max) {
        if (node == null) return true;
        if (node.value < min || node.value >= max) return false;
        boolean leftIsValid = checkTree(node.left, min, node.value);
        boolean rightIsValid = checkTree(node.right, node.value, max);
        return leftIsValid && rightIsValid;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
