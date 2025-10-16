package br.com.jdp.array;

public class SmallestMissingNonNegativeInteger {
    public static int findSmallestInteger(int[] nums, int value) {
        int[] modularDivisionRes = new int[value];
        for (int n : nums) {
            int modDivValue = n % value;
            if (modDivValue < 0) {
                modDivValue += value;
            }
            modularDivisionRes[modDivValue]++;
        }

        int min = modularDivisionRes[0];
        int position = 0;
        for (int i = 0; i < value; i++) {
            if (modularDivisionRes[i] < min) {
                position = i;
                min = modularDivisionRes[i];
            }
        }
        return value * min + position;
    }

//    public static int findSmallestInteger(int[] nums, int value) {
//        int[] count = new int[value];
//
//        // Count residues
//        for (int x : nums) {
//            // This ensures the result mod is always non-negative, even if x was negative
//            int mod = ((x % value) + value) % value;
//            count[mod]++;
//        }
//
//        int mex = 0;
//        while (true) {
//            int mod = mex % value;
//            if (count[mod] > 0) {
//                count[mod]--;
//                mex++;
//            } else {
//                return mex;
//            }
//        }
//    }


}
