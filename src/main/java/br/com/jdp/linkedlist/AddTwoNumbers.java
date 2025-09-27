package br.com.jdp.linkedlist;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = l1;
        int sum;
        int carry = 0;
        while (l1 != null) {
            sum = l1.val + (l2 != null ? l2.val : 0) + carry;

            if (sum >= 10) {
                l1.val = sum % 10;
                carry = 1;
            } else {
                l1.val = sum ;
                carry = 0;
            }

            if (l2 != null && l1.next == null && l2.next != null) {
                l1.next = l2.next;
                l2 = null;
            } else if (carry == 1 && l1.next == null) {
                l1.next = new ListNode(carry);
                carry = 0;
            }

            // next record
            l1 = l1.next;
            l2 = l2 != null ? l2.next : null;
        }


        return root;
    }
}
