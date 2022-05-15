package main.java;

public class LinkedListReverser {

    public LinkedList reverse(LinkedList linkedList) {
        Node reversedHeadNode = reverseNode(linkedList.getHead());
        return new LinkedList(reversedHeadNode);
    }

    private Node reverseNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.getNext() == null) {
            return node;
        }

        Node reversed = reverseNode(node.getNext());
        node.getNext().setNext(node);
        node.setNext(null);

        return reversed;
    }
}
