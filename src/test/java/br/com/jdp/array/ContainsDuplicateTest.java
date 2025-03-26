package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    @Test
    public void case1() {
        int[] nums = {1, 2, 3, 1};
        assertThat(new ContainsDuplicate().containsDuplicate(nums)).isTrue();
    }

    @Test
    public void case2() {
        int[] nums = {1, 2, 3, 4};
        assertThat(new ContainsDuplicate().containsDuplicate(nums)).isFalse();
    }

    @Test
    public void case3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertThat(new ContainsDuplicate().containsDuplicate(nums)).isTrue();
    }

    @Test
    public void case1_2() {
        int[] nums = {1, 2, 3, 1};
        assertThat(new ContainsDuplicate().containsDuplicate2(nums)).isTrue();
    }

    @Test
    public void case2_2() {
        int[] nums = {1, 2, 3, 4};
        assertThat(new ContainsDuplicate().containsDuplicate2(nums)).isFalse();
    }

    @Test
    public void case3_2() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertThat(new ContainsDuplicate().containsDuplicate2(nums)).isTrue();
    }

}