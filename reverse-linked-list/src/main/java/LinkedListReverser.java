package main.java;

public class LinkedListReverser {

    public LinkedList reverse(LinkedList linkedList) {
        Node reversedHeadNode = reverseNode(linkedList.head);
        return new LinkedList(reversedHeadNode);
    }

    private Node reverseNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return node;
        }

        Node reversed = reverseNode(node.next);
        node.next.next = node;
        node.next = null;

        return reversed;
    }
}
