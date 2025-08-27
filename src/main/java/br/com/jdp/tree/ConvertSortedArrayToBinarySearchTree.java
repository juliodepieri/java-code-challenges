package br.com.jdp.tree;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/631/
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    /**
     * Time = O(n)
     * Space=O(n) (dominated by tree storage, recursion adds O(log n) extra).
     */
    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null; // base case

        int mid = left + (right - left) / 2; // middle element
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);

        return node;
    }
}
