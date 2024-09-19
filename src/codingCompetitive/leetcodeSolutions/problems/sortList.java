package codingCompetitive.leetcodeSolutions.problems;

import java.util.PriorityQueue;

public class sortList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
        ListNode(){};
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode curr = head;
        while (curr != null) {
            pq.add(curr);
            curr = curr.next;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        while (!pq.isEmpty()) {
            curr = pq.poll();
            curr.next = null;
            prev.next = curr;
            prev = curr;
        }
        return prev;
    }
}
