package br.com.jdp.math;

public class PowerOfThree {
    /**
     * time: O(1)
     * space: O(1)
     * The largest power of 3 that fits in a signed 32-bit int is 1162261467 (3^19).
     * Any power of 3 must divide this number.
     */
    public static boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467;
        return n > 0 && maxPowerOf3 % n == 0;
    }


//    public static boolean isPowerOfThree(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        var logBase3 = Math.log10(n) / Math.log10(3);
//        return Math.abs(logBase3 - Math.round(logBase3)) < 1e-10;
//    }
}
