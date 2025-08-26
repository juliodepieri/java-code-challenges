package br.com.jdp.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
public class BinaryTreeLevelOrderTraversal {

    /**
     * Time = O(n), Space=O(n)
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            result.add(currentLevel);
        }

        return result;
    }

//    public List<List<Integer>> levelOrder(TreeNode root)
//    {
//        List<List<Integer>>al=new ArrayList<>();
//        pre(root,0,al);
//        return al;
//    }
//    public static void pre(TreeNode root,int l,List<List<Integer>>al)
//    {
//        if(root==null)
//            return;
//        if(al.size()==l)
//        {
//            List<Integer>li=new ArrayList<>();
//            li.add(root.val);
//            al.add(li);
//        }
//        else
//            al.get(l).add(root.val);
//        pre(root.left,l+1,al);
//        pre(root.right,l+1,al);
//    }

}
