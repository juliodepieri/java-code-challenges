package br.com.jdp.others;

public class NumberOf1Bit {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // clears the lowest set bit
            count++;
        }
        return count;

//        Integer.bitCount(n);
    }
}
