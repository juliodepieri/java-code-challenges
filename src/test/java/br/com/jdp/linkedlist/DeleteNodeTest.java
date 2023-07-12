package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeTest {

    @Test
    public void case1() {
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        new DeleteNode().deleteNode(node.next);
        assertThat(node.toString()).isEqualTo("4,1,9");
    }

    @Test
    public void case2() {
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        new DeleteNode().deleteNode(node.next.next);
        assertThat(node.toString()).isEqualTo("4,5,9");
    }

}