package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class palindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer> curr = new ArrayList<>();
        while (head != null){
            curr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = curr.size() - 1;
        while (left < right){
            if (curr.get(left) != curr.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
