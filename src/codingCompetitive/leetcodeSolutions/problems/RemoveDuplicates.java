package codingCompetitive.leetcodeSolutions.problems;

public class RemoveDuplicates {

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

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val)
                    head = head.next;
            }
            else {
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next= null;
        return dummy.next;
    }
}
