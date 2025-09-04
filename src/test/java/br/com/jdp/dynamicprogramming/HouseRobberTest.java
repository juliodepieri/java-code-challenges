package br.com.jdp.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberTest {

    @Test
    void case1() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertThat(HouseRobber.rob(nums)).isEqualTo(4);
    }

    @Test
    void case2() {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        Assertions.assertThat(HouseRobber.rob(nums)).isEqualTo(12);
    }
}