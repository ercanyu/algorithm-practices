package main.java;

public class Main {

    public static void main(String[] args) {
        TreeNode firstTree = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode secondTree = new TreeNode(2, new TreeNode(1, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(7)));

        System.out.println(mergeTrees(firstTree, secondTree).val);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        TreeNode current = new TreeNode(root1.val + root2.val);
        current.left = mergeTrees(root1.left, root2.left);
        current.right = mergeTrees(root1.right, root2.right);

        return current;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
