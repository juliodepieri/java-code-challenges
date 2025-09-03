package br.com.jdp.dynamicprogramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
public class MaximumSubarray {
    /**
     * time = O(n)
     * space = O(n)
     */
//    public static int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int[] memo = new int[n];
//
//        memo[0] = nums[0];
//        int maxSum = memo[0];
//
//        for (int i = 1; i < n; i++) {
//            memo[i] = Math.max(nums[i], nums[i] + memo[i - 1]);
//            maxSum = Math.max(maxSum, memo[i]);
//        }
//
//        return maxSum;
//    }

    /**
     * time = O(n)
     * space = O(1)
     * Kadane’s Algorithm
     */
    public static int maxSubArray(int[] nums) {
        int current = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], nums[i] + current);
            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }
}
