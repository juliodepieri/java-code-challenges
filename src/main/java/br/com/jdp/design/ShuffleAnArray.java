package br.com.jdp.design;

import java.util.Random;

public class ShuffleAnArray {
    private final int[] original;
    private int[] shuffled;
    private final Random rand = new Random();

    public ShuffleAnArray(int[] nums) {
        this.original = nums;
    }

    public int[] reset() {
        this.shuffled = original.clone();
        return this.shuffled;
    }

    public int[] shuffle() {
        this.shuffled = original.clone();

        for (int i = original.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return this.shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */