package br.com.jdp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MedianOfTwoSortedArraysTest {

    @Test
    void case1() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{1, 2, 3};
        Assertions.assertThat(MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2)).isEqualTo(2);
    }

    @Test
    void case2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        Assertions.assertThat(MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2)).isEqualTo(2.5);
    }

    @Test
    void case3() {
        int[] nums1 = new int[]{-2, 1};
        int[] nums2 = new int[]{3, 4};
        Assertions.assertThat(MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2)).isEqualTo(2);
    }

}