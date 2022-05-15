package main.java;

public class LinkedList {
    public Node head;
    public Node last;

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
        last.next = node;
        last = node;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print("[" + node.data + "]");
            node = node.next;
        }
    }
}
