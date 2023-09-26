package br.com.jdp.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    @Test
    public void case1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        assertThat(new MergeTwoSortedLists().mergeTwoLists(list1, list2).toString()).isEqualTo("1,1,2,3,4,4");
    }

    @Test
    public void case2() {
        assertThat(new MergeTwoSortedLists().mergeTwoLists(null, null)).isNull();
    }

    @Test
    public void case3() {
        ListNode list2 = new ListNode(0);
        assertThat(new MergeTwoSortedLists().mergeTwoLists(null, list2).toString()).isEqualTo("0");
    }

    @Test
    public void case4() {
        ListNode list1 = new ListNode(1, new ListNode(2));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        assertThat(new MergeTwoSortedLists().mergeTwoLists(list1, list2).toString()).isEqualTo("1,1,2,3,4");
    }

    @Test
    public void case5() {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(2));
        assertThat(new MergeTwoSortedLists().mergeTwoLists(list1, list2).toString()).isEqualTo("1,1,2,3,4");
    }

    @Test
    public void case6() {
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode list2 = new ListNode(1, new ListNode(1));
        assertThat(new MergeTwoSortedLists().mergeTwoLists(list1, list2).toString()).isEqualTo("1,1,1,1,1");
    }

    @Test
    public void case7() {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(1);
        assertThat(new MergeTwoSortedLists().mergeTwoLists(list1, list2).toString()).isEqualTo("1,2");
    }

}