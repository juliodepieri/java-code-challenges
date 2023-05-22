package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {

    @Test
    public void case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        assertThat(new IntersectionOfTwoArrays().intersect(nums1, nums2)).contains(2, 2);
    }

    @Test
    public void case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        assertThat(new IntersectionOfTwoArrays().intersect(nums1, nums2)).contains(9, 4);
    }

}