package br.com.jdp.linkedlist;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/
public class PalindromeLinkedList {

    /**
     * Time = O(n), Space=O(1)
     */
    ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Time = O(n), Space=O(1)
     */
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    /**
     * Time = O(n), Space=O(1)
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverse(middle);

        ListNode start = head;
        while (secondHalf != null && start!=null) {
            if (start.val != secondHalf.val) {
                return false;
            }
            start = start.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}
