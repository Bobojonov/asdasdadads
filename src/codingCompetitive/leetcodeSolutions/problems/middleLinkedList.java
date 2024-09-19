package codingCompetitive.leetcodeSolutions.problems;

public class middleLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
     public ListNode middleNode(ListNode head) {
        ListNode[] res = new ListNode[100];
        int i = 0;
        while (head != null){
            res[i++] = head;
            head = head.next;
        }
        return res[i / 2];
    }
    public static void main(String[] args) {

    }
}
