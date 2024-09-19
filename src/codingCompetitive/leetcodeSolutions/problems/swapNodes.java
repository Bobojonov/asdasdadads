package codingCompetitive.leetcodeSolutions.problems;


public class swapNodes {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy, curr = head;
        dummy.next = head;
        while (curr != null && curr.next != null) {
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            curr = curr.next;
            prev = prev.next.next;
        }
        return dummy.next;
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//
//        ListNode prev = dummy;
//        while(head != null && head.next != null) {
//            ListNode first = head;
//            ListNode second = head.next;
//            prev.next = second;
//            first.next = second.next;
//            second.next = first;
//            prev = first;
//            head = first.next;
//        }
//        return dummy.next;
    }

}
