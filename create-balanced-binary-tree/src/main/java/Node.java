package main.java;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Value: " + value);
        if (left != null) {
            System.out.println("Left: " + left.value);
        }
        if (right != null) {
            System.out.println("Right: " + right.value);
        }
    }
}
