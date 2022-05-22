package main.java;

public class Main {
    public static void main(String[] args) {
        Node root = BinarySearchTree.sampleBinarySearchTree();
        boolean validBinarySearchTree = isValidBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(validBinarySearchTree ? "valid" : "not valid");
    }

    private static boolean isValidBinarySearchTree(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.value < min || node.value > max)
            return false;

        return (isValidBinarySearchTree(node.left, min, node.value - 1) &&
                isValidBinarySearchTree(node.right, node.value + 1, max));
    }
}
