package main.java;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Node("1"));
        linkedList.add(new Node("2"));
        linkedList.add(new Node("3"));

        System.out.println("Printing Linked List");
        linkedList.printList();
        System.out.println();

        LinkedListReverser reverser = new LinkedListReverser();
        LinkedList reversedLinkedList = reverser.reverse(linkedList);
        System.out.println("Printing Reversed Linked List -> ");
        reversedLinkedList.printList();
    }
}
