package br.com.jdp.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedBinaryTreeTest {
    private final BalancedBinaryTree solution = new BalancedBinaryTree();

    @Test
    void case1() {
        TreeNode root = null;

        boolean result = solution.isBalanced(root);

        assertThat(result).isTrue();
    }

    @Test
    void case2() {
        TreeNode root = new TreeNode(1);

        boolean result = solution.isBalanced(root);

        assertThat(result).isTrue();
    }

    @Test
    void case3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        boolean result = solution.isBalanced(root);

        assertThat(result).isTrue();
    }

    @Test
    void case4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        boolean result = solution.isBalanced(root);

        assertThat(result).isFalse();
    }

    @Test
    void case5() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        boolean result = solution.isBalanced(root);

        assertThat(result).isFalse();
    }

    @Test
    void case6() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);

        boolean result = solution.isBalanced(root);

        assertThat(result).isTrue();
    }
}