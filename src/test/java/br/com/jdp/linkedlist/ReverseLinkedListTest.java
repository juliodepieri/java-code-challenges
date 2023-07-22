package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

    @Test
    public void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(new ReverseLinkedList().reverseList(head).toString()).isEqualTo("5,4,3,2,1");
    }

    @Test
    public void case2() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertThat(new ReverseLinkedList().reverseList(head).toString()).isEqualTo("2,1");
    }

    @Test
    public void case3() {
        assertThat(new ReverseLinkedList().reverseList(null)).isNull();
    }

}