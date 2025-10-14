package br.com.jdp.array;

import java.util.List;

public class AdjacentIncreasingSubarraysDetection {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) {
            return true;
        }

        for (int i = 0; i <= nums.size() - (k * 2); i++) {
            boolean isIncreasing = true;
            for (int j = i; j < (i + k) - 1; j++) {
                int j2 = j + k;
                if ((nums.get(j) >= nums.get(j + 1))
                    || (nums.get(j2) >= nums.get(j2 + 1))) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                return true;
            }
        }
        return false;
    }

//    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
//        int n = nums.size();
//
//        for (int i = 0; i + 2 * k <= n; i++) {
//            if (isStrictlyIncreasing(nums, i, i + k - 1) &&
//                isStrictlyIncreasing(nums, i + k, i + 2 * k - 1)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    private static boolean isStrictlyIncreasing(List<Integer> nums, int start, int end) {
//        for (int i = start; i < end; i++) {
//            if (nums.get(i) >= nums.get(i + 1)) return false;
//        }
//        return true;
//    }
}
