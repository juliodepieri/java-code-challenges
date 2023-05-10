package br.com.jdp.array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        var n = nums.length;
        k %= n; // Number of swaps. K can be greater than the size of the array
        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);
    }

    private void reverse(int i, int j, int[] nums) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
