package br.com.jdp.linkedlist;

/**
 * time: O(n)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
