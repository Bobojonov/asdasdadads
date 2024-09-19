package codingCompetitive.leetcodeSolutions.problems;

public class removeDuplicatesFromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null){
            if (node.next.val == node.val) node.next = node.next.next;
            else node = node.next;
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}
