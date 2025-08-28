package br.com.jdp.sortingandsearching;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
public class MergeSortedArray {
    /**
     * Time = O(m + n) We scan through both arrays once.
     * Space=O(1) We merge in-place, using only a few pointers (constant extra space).
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // fill nums1 with leftover nums2 elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
