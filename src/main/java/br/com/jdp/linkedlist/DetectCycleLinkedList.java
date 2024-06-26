package br.com.jdp.linkedlist;

// https://leetcode.com/problems/linked-list-cycle-ii
public class DetectCycleLinkedList {

    public static boolean detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Hare-Tortoise algorithm approach
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
               return true;
            }
        }
        return false;
    }
}
