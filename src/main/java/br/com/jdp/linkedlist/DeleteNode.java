package br.com.jdp.linkedlist;

/**
 * time: O(1)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/553/
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        System.gc();
    }

}
