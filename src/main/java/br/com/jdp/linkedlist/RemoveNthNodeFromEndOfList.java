package br.com.jdp.linkedlist;

/**
 * time: O(n)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) {
            return null;
        }

        ListNode r = head;
        ListNode l = head;
        int count = 1;
        while (l.next != null) {
            if (count > n) {
                r = r.next;
            }
            l = l.next;
            count++;
        }

        if (count == n) {
            return r.next;
        }
        r.next = r.next.next;
        return head;
    }
}
