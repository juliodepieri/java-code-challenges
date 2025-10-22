package br.com.jdp.array;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class MaxFrequencyElementOperationsII {
    /**
     * Time complexity: O(nlogn).
     * Space complexity: O(n).
     */
    public static int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int ans = 0;
        Map<Integer, Integer> numCount = new HashMap<>();
        Set<Integer> modes = new TreeSet<>();

        Consumer<Integer> addMode = value -> {
            modes.add(value);
            if (value - k >= nums[0]) {
                modes.add(value - k);
            }
            if (value + k <= nums[nums.length - 1]) {
                modes.add(value + k);
            }
        };

        int lastNumIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != nums[lastNumIndex]) {
                numCount.put(nums[lastNumIndex], i - lastNumIndex);
                ans = Math.max(ans, i - lastNumIndex);
                addMode.accept(nums[lastNumIndex]);
                lastNumIndex = i;
            }
        }

        numCount.put(nums[lastNumIndex], nums.length - lastNumIndex);
        ans = Math.max(ans, nums.length - lastNumIndex);
        addMode.accept(nums[lastNumIndex]);

        IntUnaryOperator leftBound = value -> {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] < value) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        };

        IntUnaryOperator rightBound = value -> {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = (left + right + 1) / 2;
                if (nums[mid] > value) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            return left;
        };

        for (int mode : modes) {
            int l = leftBound.applyAsInt(mode - k);
            int r = rightBound.applyAsInt(mode + k);
            int tempAns;
            if (numCount.containsKey(mode)) {
                tempAns = Math.min(
                        r - l + 1,
                        numCount.get(mode) + numOperations
                );
            } else {
                tempAns = Math.min(r - l + 1, numOperations);
            }
            ans = Math.max(ans, tempAns);
        }

        return ans;
    }

//    public int maxFrequency(int[] nums, int k, int ops) {
//        int res = 0;
//        Arrays.sort(nums);
//        int left = 0;
//        int right = 0;
//        int n = nums.length;
//        int i = 0;
//        // case 1, num is in the arr
//        while (i < n) {
//            int val = nums[i];
//            int same = 0;
//            while (i < n && nums[i] == val) {
//                same++;
//                i++;
//            }
//            while (right < n && nums[right] <= val + k) {
//                right++;
//            }
//            while (left < n && nums[left] < val - k) {
//                left++;
//            }
//            res = Math.max(res, Math.min(same + ops, right - left));
//        }
//        // case 2, num is not in the arr
//        left = 0;
//        right = 0;
//        while (right < n) {
//            while (right < n && (long) nums[left] + k + k >= nums[right]) {
//                right++;
//            }
//            res = Math.max(res, Math.min(right - left, ops));
//            left++;
//        }
//        return res;
//    }
}
