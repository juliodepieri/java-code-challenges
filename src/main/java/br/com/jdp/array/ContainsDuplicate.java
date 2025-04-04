package br.com.jdp.array;

import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

public class ContainsDuplicate {

    // time complexity: O(N)
    // space complexity: O(N)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    // time complexity: O(n log(n))
    // space complexity: O(1)
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums); // O(n log(n))
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
