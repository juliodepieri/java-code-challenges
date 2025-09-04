package br.com.jdp.dynamicprogramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
public class HouseRobber {
    /**
     * time: O(n)
     * space: O(1)
     */
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int rob = 0;   // max if we rob current
        int skip = 0;  // max if we skip current

        for (int n : nums) {
            int newRob = skip + n;
            int newSkip = Math.max(skip, rob);

            rob = newRob;
            skip = newSkip;
        }

        return Math.max(rob, skip);
    }
}
