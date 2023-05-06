package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTest {

    @Test
    public void case1() {
        int[] nums = {1, 1, 2};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertThat(removeDuplicates.removeDuplicates(nums)).isEqualTo(2);
        assertThat(nums).startsWith(1, 2);
    }

    @Test
    public void case2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertThat(removeDuplicates.removeDuplicates(nums)).isEqualTo(5);
        assertThat(nums).startsWith(0, 1, 2, 3, 4);
    }

    @Test
    public void case3() {
        int[] nums = {1, 2};

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        assertThat(removeDuplicates.removeDuplicates(nums)).isEqualTo(2);
        assertThat(nums).startsWith(1, 2);
    }

}