package codingCompetitive.leetcodeSolutions.algoAndDs.ds;

import java.util.NoSuchElementException;

class LinkedList<E> {

    int size;
    private Node head;
    private Node tail;

    public void add(E elem) {
        if (head == null)
            head = tail = new Node(elem);
        else {
            tail.next = new Node(elem);
            tail = tail.next;
        }
        size++;
    }

    public E get(int idx) {
        if (idx >= size || size < 0) throw new NoSuchElementException();
        Node node = head;
        for (int i = 0; i < size; i++)
            node = node.next;
        return node.elem;
    }

    public boolean delete(E elem) {
        Node temp = new Node(null, head);
        Node dummy = temp;
        while (temp.next != null) {
            if (temp.next.elem.equals(elem)) {
                if (temp.next == tail) tail = temp;
                temp.next = temp.next.next;
                head = dummy.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    private class Node {
        E elem;
        Node next;
        public Node(E elem) {
            this.elem = elem;
        }

        public Node(E elem, Node node) {
            this.elem = elem;
            this.next = node;
        }

    }
}

