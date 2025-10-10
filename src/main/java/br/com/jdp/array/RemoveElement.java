package br.com.jdp.array;

public class RemoveElement {
    /**
     * Time: O(n)
     * Space: O(1)
     */
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                swap(nums, left, right);
                right--;
                if (nums[left] != val) {
                    left++;
                }
            } else if (nums[right] == val) {
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
