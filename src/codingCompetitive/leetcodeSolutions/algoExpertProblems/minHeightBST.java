package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.List;

public class minHeightBST {
    public static BST minHeightBst(List<Integer> array) {
        if (array.size() == 0) return null;
        int mid = array.size() / 2;
        BST midTree = new BST(array.get(mid));
        minHeight(midTree, 0, mid - 1, array);
        minHeight(midTree, mid + 1, array.size() - 1, array);
        return midTree;
    }

    public static void minHeight(BST midTree, int left, int right, List<Integer> array) {
        if (left > right) return;
        int mid = left + (right - left) / 2;
        midTree.insert(array.get(mid));
        minHeight(midTree, left, mid - 1, array);
        minHeight(midTree, mid + 1, right, array);

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
