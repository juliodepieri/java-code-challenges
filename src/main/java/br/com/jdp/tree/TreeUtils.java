package br.com.jdp.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    // Level-order traversal to list
    public static Integer[] toArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return new Integer[0];

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                result.add(null);
                continue;
            }
            result.add(current.val);
            queue.offer(current.left);
            queue.offer(current.right);
        }

        // Remove trailing nulls
        int last = result.size() - 1;
        while (last >= 0 && result.get(last) == null) {
            last--;
        }

        return result.subList(0, last + 1).toArray(new Integer[0]);
    }
}
