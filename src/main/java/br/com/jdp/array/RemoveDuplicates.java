package br.com.jdp.array;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int leftPointer = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[leftPointer] = nums[i + 1];
                leftPointer++;
            }
        }

        return leftPointer;
    }
}
