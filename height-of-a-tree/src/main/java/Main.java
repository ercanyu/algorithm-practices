package main.java;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = buildTree();
        int binaryTreeHeight = findBinaryTreeHeight(binaryTree);

        System.out.println("Height of tree is: " + binaryTreeHeight);
    }

    private static int findBinaryTreeHeight(BinaryTree binaryTree) {
        return findMaxDepth(binaryTree.root);
    }

    private static int findMaxDepth(Node node) {
        if (node == null) {
            return -1;
        } else {
            int leftSubtreeMaxDepth = findMaxDepth(node.left);
            int rightSubtreeMaxDepth = findMaxDepth(node.right);

            return Integer.max(leftSubtreeMaxDepth, rightSubtreeMaxDepth) + 1;
        }
    }

    private static BinaryTree buildTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.left = new Node(6);
        binaryTree.root.right.right = new Node(7);
        binaryTree.root.left.left.left = new Node(8);

        return binaryTree;
    }
}
