package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveNthNodeFromEndOfListTest {

    @Test
    public void case1() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 2).toString()).isEqualTo("1,2,3,5");
    }

    @Test
    public void case2() {
        ListNode node = new ListNode(1);
        assertThat(new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 1)).isNull();
    }

    @Test
    public void case3() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertThat(new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 1).toString()).isEqualTo("1");
    }

    @Test
    public void case4() {
        ListNode node = new ListNode(1, new ListNode(2));
        assertThat(new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 2).toString()).isEqualTo("2");
    }

}