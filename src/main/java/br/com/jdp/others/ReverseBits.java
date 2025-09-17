package br.com.jdp.others;

public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;        // shift result left
            result |= (n & 1);   // append the last bit of n (bitwise OR operator.)
            n >>= 1;             // shift n right
        }

        return result;

//        solution 2
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            int bit = (n >> i) & 1;
//            res += (bit << (31 - i));
//        }
//        return res;
    }
}
