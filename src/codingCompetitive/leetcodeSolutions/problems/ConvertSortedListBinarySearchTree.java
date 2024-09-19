package codingCompetitive.leetcodeSolutions.problems;

public class ConvertSortedListBinarySearchTree {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return toBST(head,null);
    }

    public TreeNode toBST(ListNode h, ListNode t) {
        ListNode slow = h;
        ListNode fast = h;
        if (h == t) return null;
        while (fast != t && fast.next != t) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode th = new TreeNode(slow.val);
        System.out.println(th.val);
        th.left = toBST(h, slow);
        th.right = toBST(slow.next, t);
        return th;
    }
}
