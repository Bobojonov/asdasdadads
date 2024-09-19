package codingCompetitive.leetcodeSolutions.problems;

public class MiddleOfLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode middle = head;
        ListNode point   = head;
        while (point != null && point.next != null) {
            middle = middle.next;
            point = point.next.next;
        }
        return middle;
    }
}
