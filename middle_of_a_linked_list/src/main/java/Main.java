package main.java;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Node("1"));
        linkedList.add(new Node("2"));
        linkedList.add(new Node("3"));
        linkedList.add(new Node("4"));
        linkedList.add(new Node("5"));
        linkedList.add(new Node("6"));

        System.out.println("Printing Linked List");
        linkedList.printList();
        System.out.println();

        System.out.println("Middle Element is => " + findMiddleElement(linkedList));
    }

    private static String findMiddleElement(LinkedList linkedList) {
        if (linkedList == null || linkedList.head == null) {
            return null;
        }

        Node slowPointer = linkedList.head;
        Node fastPointer = linkedList.head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer.data;
    }
}
