package br.com.jdp.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MaximumSubarrayTest {

    @Test
    void case1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    void case2() {
        int[] nums = new int[]{1};
        Assertions.assertEquals(1, MaximumSubarray.maxSubArray(nums));
    }

    @Test
    void case3() {
        int[] nums = new int[]{5, 4, -1, 7, 8};
        Assertions.assertEquals(23, MaximumSubarray.maxSubArray(nums));
    }
}