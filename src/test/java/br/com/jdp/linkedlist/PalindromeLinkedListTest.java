package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeLinkedListTest {
    @Test
    void case1() {
        ListNode lastNode = new ListNode(-4);
        ListNode cycle = new ListNode(2, new ListNode(0, lastNode));
        lastNode.next = cycle;

        ListNode head = new ListNode(3, cycle);
        ListNode result = DetectCycleLinkedList.detectCycle(head);
        assertThat(result).isNotNull();
    }
}