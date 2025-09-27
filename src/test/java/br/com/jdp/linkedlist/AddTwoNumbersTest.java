package br.com.jdp.linkedlist;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    @Test
    void case1() {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Assertions.assertThat(AddTwoNumbers.addTwoNumbers(l1, l2))
                .hasToString("7,0,8");
    }

    @Test
    void case2() {
        var l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        Assertions.assertThat(AddTwoNumbers.addTwoNumbers(l1, l2))
                .hasToString("8,9,9,9,0,0,0,1");

    }

}