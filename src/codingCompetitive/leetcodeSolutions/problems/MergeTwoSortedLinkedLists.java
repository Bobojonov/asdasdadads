package codingCompetitive.leetcodeSolutions.problems;

class RemoveNthNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while (n > 0) {
            right = right.next;
            n--;
        }
        printList("Dummy", dummy);
        printList("Head", head);
        printList("Left", left);
        printList("Right", right);
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        printList("Dummy", dummy);
        printList("Head", head);
        printList("Left", left);
        printList("Right", right);
        printList("Dummy", dummy);
        return dummy.next;
    }

    private void printList(String name, ListNode node) {
        System.out.print(name + ": ");
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
