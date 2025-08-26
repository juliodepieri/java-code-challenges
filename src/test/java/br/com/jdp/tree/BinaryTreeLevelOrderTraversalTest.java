package br.com.jdp.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void case1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> response = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertThat(response.get(0)).isEqualTo(List.of(3));
        assertThat(response.get(1)).isEqualTo(List.of(9, 20));
        assertThat(response.get(2)).isEqualTo(List.of(15, 7));
    }

    @Test
    public void case2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), null);
        root.right = new TreeNode(3, null, new TreeNode(5));

        List<List<Integer>> response = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        assertThat(response.get(0)).isEqualTo(List.of(1));
        assertThat(response.get(1)).isEqualTo(List.of(2, 3));
        assertThat(response.get(2)).isEqualTo(List.of(4, 5));
    }
}