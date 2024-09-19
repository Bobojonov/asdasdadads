package codingCompetitive.leetcodeSolutions.problems;

import codingCompetitive.leetcodeSolutions.algoAndDs.linkedList.SinglyLinkedList;

public class removeLinkedListElements {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        display(dummy);
        ListNode curr = dummy;
        display(curr);
        System.out.println();
        while (curr.next != null) {
            if (curr.next.val == val)
                curr.next = curr.next.next;
            else curr = curr.next;
            display(dummy);
            display(curr);
            System.out.println();
        }
        return dummy.next;
    }

    public void display(ListNode head) {
        if (head == null) System.out.println("null");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

    }
}
