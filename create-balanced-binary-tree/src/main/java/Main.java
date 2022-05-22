package main.java;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Node root = createBalancedBinarySearchTree(array, 0, array.length - 1);
        if (root != null) {
            root.print();
        }
    }

    private static Node createBalancedBinarySearchTree(int[] array, int left, int right) {
        if (left > right) {
            return null;
        }

        if (left == right) {
            return new Node(array[left]);
        }

        int mid = (left + right) / 2;

        Node root = new Node(array[mid]);
        root.left = createBalancedBinarySearchTree(array, left, mid - 1);
        root.right = createBalancedBinarySearchTree(array, mid + 1, right);

        return root;
    }
}
