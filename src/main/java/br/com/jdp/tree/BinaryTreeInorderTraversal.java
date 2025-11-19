package br.com.jdp.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    /**
     * O(n) time
     * O(h) stack space
     * h = height of the binary tree
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // go all the way to the left
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // process node
            curr = stack.pop();
            result.add(curr.val);

            // move to right subtree
            curr = curr.right;
        }

        return result;
    }
}


//public List<Integer> inorderTraversal(TreeNode root) {
//    List<Integer> result = new ArrayList<>();
//    inorder(root, result);
//    return result;
//}
//
//private void inorder(TreeNode node, List<Integer> result) {
//    if (node == null) return;
//    inorder(node.left, result);
//    result.add(node.val);
//    inorder(node.right, result);
//}



//O(1)
//public List<Integer> inorderTraversal(TreeNode root) {
//    List<Integer> result = new ArrayList<>();
//    TreeNode curr = root;
//
//    while (curr != null) {
//        if (curr.left == null) {
//            result.add(curr.val);
//            curr = curr.right;
//        } else {
//            TreeNode pre = curr.left;
//            while (pre.right != null && pre.right != curr) {
//                pre = pre.right;
//            }
//
//            if (pre.right == null) {
//                pre.right = curr; // thread
//                curr = curr.left;
//            } else {
//                pre.right = null; // remove thread
//                result.add(curr.val);
//                curr = curr.right;
//            }
//        }
//    }
//
//    return result;
//}
