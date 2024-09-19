package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class removeDuplicatesFromLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList curr = linkedList;
        while (curr.next != null) {
            if (curr.value == curr.next.value)
                curr.next = curr.next.next;
            else curr = curr.next;
        }
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
