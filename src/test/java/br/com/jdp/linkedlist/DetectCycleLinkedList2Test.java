package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DetectCycleLinkedList2Test {

    @Test
    void case1() {
        ListNode lastNode = new ListNode(-4);
        ListNode cycle = new ListNode(2, new ListNode(0, lastNode));
        lastNode.next = cycle;

        ListNode head = new ListNode(3, cycle);
        ListNode result = DetectCycleLinkedList2.detectCycle(head);
        assertThat(result).isNotNull();
    }

    @Test
    void case2() {
        ListNode lastNode = new ListNode(2);
        ListNode cycle =new ListNode(1, lastNode);
        lastNode.next = cycle;

        ListNode result = DetectCycleLinkedList2.detectCycle(cycle);
        assertThat(result).isNotNull();
    }
}
