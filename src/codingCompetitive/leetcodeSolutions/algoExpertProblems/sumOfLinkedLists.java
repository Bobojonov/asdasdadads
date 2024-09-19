package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class sumOfLinkedLists {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList result = new LinkedList(0);
        LinkedList iterator = result;
        int sum = 0;
        while (linkedListOne != null || linkedListTwo != null) {
            int curr = sum;
            if (linkedListOne != null) {
                curr += linkedListOne.value;
                linkedListOne = linkedListOne.next;
            }

            if (linkedListTwo != null) {
                curr += linkedListTwo.value;
                linkedListTwo = linkedListTwo.next;
            }

            sum = curr / 10;
            curr = curr % 10;
            iterator.value = curr; // 1 9

            if (linkedListOne != null || linkedListTwo != null || sum > 0) {
                iterator.next = new LinkedList(0);
                iterator = iterator.next;
            }
        }
        if (sum > 0)
            iterator.value = sum;
        return iterator;
    }
}
