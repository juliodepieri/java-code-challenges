package br.com.jdp.tree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1; // Left subtree is unbalanced

        int right = checkHeight(node.right);
        if (right == -1) return -1; // Right subtree is unbalanced

        if (Math.abs(left - right) > 1) return -1; // Current node is unbalanced

        return Math.max(left, right) + 1; // Height of this node
    }
}
