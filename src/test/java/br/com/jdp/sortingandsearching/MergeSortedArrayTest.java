package br.com.jdp.sortingandsearching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {

    @Test
    public void case1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        MergeSortedArray.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        System.out.println(Arrays.toString(nums1));

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case2() {
        int[] nums1 = new int[]{1};
        MergeSortedArray.merge(nums1, 1, new int[]{}, 0);
        int[] expected = new int[]{1};

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case3() {
        int[] nums1 = new int[]{0};
        MergeSortedArray.merge(nums1, 0, new int[]{1}, 1);
        int[] expected = new int[]{1};

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void case4() {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        MergeSortedArray.merge(nums1, 3, new int[]{1, 2, 3}, 3);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        assertArrayEquals(expected, nums1);
    }
}