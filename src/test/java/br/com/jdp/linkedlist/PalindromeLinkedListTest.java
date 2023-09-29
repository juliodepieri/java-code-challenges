package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeLinkedListTest {
    @Test
    void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean result = new PalindromeLinkedList().isPalindrome(head);
        assertThat(result).isTrue();
    }

    @Test
    void case2() {
        var values = new int[]{2, 2, 1, 5, 7, 5, 3, 8, 9, 0, 6, 5, 9, 6, 9, 2, 1, 3, 0, 8, 8, 4, 8, 9, 0, 3, 5, 6, 8, 9, 0, 1, 3, 2, 1, 0, 9, 8, 6, 5, 3, 0, 9, 8, 4, 8, 8, 0, 3, 1, 2, 9, 6, 9, 5, 6, 0, 9, 8, 3, 5, 7, 5, 1, 2, 2, 1};

        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (var value : values) {
            temp.next = new ListNode(value);
            temp = temp.next;
        }
        boolean result = new PalindromeLinkedList().isPalindrome(head);
        assertThat(result).isFalse();
    }
}