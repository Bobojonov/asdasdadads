package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            insertHelper(this, value);
            return this;
        }

        public  BST insertHelper(BST binaryTree, int value) {
            if (binaryTree == null) return new BST(value);
            if (value < binaryTree.value) binaryTree.left = insertHelper(binaryTree.left, value);
            else binaryTree.right = insertHelper(binaryTree.right, value);
            return binaryTree;
        }

        public boolean contains(int value) {
            return containsHelper(this, value);
        }

        public boolean containsHelper(BST binaryTree, int value) {
            if (binaryTree == null) return false;
            if (binaryTree.value == value) return true;
            else if (value < binaryTree.value) return containsHelper(binaryTree.left, value);
            else return containsHelper(binaryTree.right, value);
        }

        public BST remove(int value) {
            removeHelper(this, value);
            return this;
        }

        public BST removeHelper(BST binaryTree, int value) {
            if (binaryTree == null) return binaryTree;
            if (value < binaryTree.value) binaryTree.left = removeHelper(binaryTree.left, value);
            else if (value > binaryTree.value) binaryTree.right = removeHelper(binaryTree.right, value);
            else {
                if (binaryTree.left == null && binaryTree.right == null) return null;
                if (binaryTree.left != null && binaryTree.right == null) {
                    binaryTree.value = binaryTree.left.value;
                    binaryTree.right = binaryTree.left.right;
                    binaryTree.left = binaryTree.left.left;
                    return binaryTree;
                }
                if (binaryTree.left == null && binaryTree.right != null) {
                    binaryTree.value = binaryTree.right.value;
                    binaryTree.left = binaryTree.right.left;
                    binaryTree.right = binaryTree.right.right;
                    return binaryTree;
                }
                if (binaryTree.left != null && binaryTree.right != null) {
                    int smallest = smallestValue(binaryTree.right);
                    binaryTree.value = smallest;
                    binaryTree.right = removeHelper(binaryTree.right, smallest);
                    return binaryTree;
                }

            }
            return binaryTree;
        }

        public int smallestValue(BST binaryTree) {
            return binaryTree.left == null ? binaryTree.value : smallestValue(binaryTree.left);
        }
    }
}
