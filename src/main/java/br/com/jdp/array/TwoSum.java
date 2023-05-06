package br.com.jdp.array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int complement = target - number;

            if (complements.containsKey(complement)) {
                return new int[]{complements.get(complement), i};
            }
            complements.put(number, i);
        }

        return new int[]{};
    }
}
