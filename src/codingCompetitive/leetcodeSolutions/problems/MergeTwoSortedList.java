package codingCompetitive.leetcodeSolutions.problems;

public class MergeTwoSortedList {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
            display(tail);
            display(head);
            System.out.println();
        }
        tail.next = list1 == null ? list2 : list1;
        System.out.println();
        display(tail);
        display(head);
        return head.next;

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

}
