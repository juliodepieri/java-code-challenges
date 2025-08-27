package br.com.jdp.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void case1() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Integer[] expected = new Integer[]{0, -10, 5, null, -3, null, 9};

        TreeNode root = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(nums);

        assertThat(root).isNotNull();
        assertThat(TreeUtils.toArray(root)).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] nums = new int[]{1, 3};
        Integer[] expected = new Integer[]{1, null, 3};

        TreeNode root = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(nums);

        assertThat(root).isNotNull();
        assertThat(TreeUtils.toArray(root)).isEqualTo(expected);
    }
}