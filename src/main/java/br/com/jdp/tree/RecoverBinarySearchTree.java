package br.com.jdp.tree;

public class RecoverBinarySearchTree {
    TreeNode first = null, second = null, prev = new TreeNode(Integer.MIN_VALUE);

    /**
     * O(n) time, O(1) space
     */
    public void recoverTree(TreeNode root) {
        inorder(root);

        // Swap values of the two misplaced nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        // Detect violation
        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }

        prev = root;

        inorder(root.right);
    }
}
