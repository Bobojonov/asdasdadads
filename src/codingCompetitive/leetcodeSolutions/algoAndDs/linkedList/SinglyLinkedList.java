package codingCompetitive.leetcodeSolutions.algoAndDs.linkedList;

import java.io.IOException;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val  = val;
            this.next = null;
        }
    }

    public void display() {
        if (head == null) System.out.println("null");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode curr  = head;
        ListNode prev  = null;
        ListNode next  = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddleNode() {
        if (head == null)
            return null;
        ListNode middle   = head;
        ListNode nextNode = head;
        while (middle != null && nextNode.next != null) {
            middle = middle.next;
            nextNode = nextNode.next.next;
        }
        return middle;
    }

    public ListNode nThNode(int n) {
        if (head == null) return null;
        ListNode mainPtr = head;
        ListNode refPtr  = head;
        int cnt = 0;
        while (cnt < n) {
            cnt++;
            refPtr = refPtr.next;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public ListNode insertNodeToSorted(int val) {
        ListNode newNode = new ListNode(val);
        ListNode curr    = head;
        ListNode temp    = null;
        while (curr != null && curr.val < val) {
            temp = curr;
            curr = curr.next;
        }
        newNode.next = curr;
        temp.next = newNode;
        return head;
    }

    public void deleteNode(int key) {
        if (head == null) return;
        ListNode curr = head;
        ListNode temp = null;
        while (curr != null && curr.val != key) {
            temp = curr;
            curr = curr.next;
        }
        if (curr == null) return;
        temp.next = curr.next;
    }
    public boolean detectLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    public void createALoop() {
        ListNode first  = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third  = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode five   = new ListNode(5);
        ListNode six    = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = third;
    }
    public static void main(String[] args)  throws IOException {
        SinglyLinkedList linked = new SinglyLinkedList();
        linked.createALoop();
        System.out.println(linked.detectLoop());

    }

}
