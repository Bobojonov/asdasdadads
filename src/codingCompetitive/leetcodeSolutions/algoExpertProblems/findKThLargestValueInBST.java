package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.LinkedList;

public class findKThLargestValueInBST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        LinkedList<BST> node = new LinkedList<>();
        while (true) {
            while (tree != null) {
                node.push(tree);
                tree = tree.right;
            }
            tree = node.pop();
            if (k-- == 0) return tree.value;
            tree = tree.left;
        }
    }
}
