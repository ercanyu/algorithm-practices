package main.java;

public class LinkedList {
    private Node head;
    private Node last;

    public LinkedList() {
        head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
            last = head;
        }
        last.setNext(node);
        last = node;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print("[" + node.getData() + "]");
            node = node.getNext();
        }
    }
}
