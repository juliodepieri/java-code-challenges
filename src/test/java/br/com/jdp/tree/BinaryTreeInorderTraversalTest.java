package br.com.jdp.tree;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static br.com.jdp.tree.BinaryTreeInorderTraversal.inorderTraversal;

class BinaryTreeInorderTraversalTest {

    @Test
    void case1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        Assertions.assertThat(inorderTraversal(root)).isEqualTo(List.of(1,3,2));
    }

}