package br.com.jdp.tree;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    @Test
    void case1() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        Assertions.assertThat(SameTree.isSameTree(t1, t2)).isTrue();
    }

    @Test
    void case2() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(1);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);
        Assertions.assertThat(SameTree.isSameTree(t1, t2)).isFalse();
    }

    @Test
    void case3() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);

        TreeNode t2 = new TreeNode(1);
        t2.right = new TreeNode(2);
        Assertions.assertThat(SameTree.isSameTree(t1, t2)).isFalse();
    }

}