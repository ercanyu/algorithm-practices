package main.java;

public class Node {
    private final String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
