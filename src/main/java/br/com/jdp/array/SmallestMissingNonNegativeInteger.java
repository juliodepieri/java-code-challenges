package br.com.jdp.array;

public class SmallestMissingNonNegativeInteger {
    public static int findSmallestInteger(int[] nums, int value) {
        int[] count = new int[value];

        // Count residues
        for (int x : nums) {
            // This ensures the result mod is always non-negative, even if x was negative
            int mod = ((x % value) + value) % value;
            count[mod]++;
        }

        int mex = 0;
        while (true) {
            int mod = mex % value;
            if (count[mod] > 0) {
                count[mod]--;
                mex++;
            } else {
                return mex;
            }
        }
    }


}
