package br.com.jdp.array;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.array.SmallestMissingNonNegativeInteger.findSmallestInteger;

class SmallestMissingNonNegativeIntegerTest {

    @Test
    void case1() {
        int[] nums = new int[]{1, -10, 7, 13, 6, 8};
        Assertions.assertThat(findSmallestInteger(nums, 5)).isEqualTo(4);
    }

    @Test
    void case2() {
        int[] nums = new int[]{1, -10, 7, 13, 6, 8};
        Assertions.assertThat(findSmallestInteger(nums, 7)).isEqualTo(2);
    }
}