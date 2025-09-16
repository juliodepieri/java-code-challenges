package br.com.jdp.others;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((x >>> i) & 1) != ((y >>> i) & 1)) {
                count++;
            }
        }
        return count;
    }



//    public int hammingDistance(int x, int y) {
//        int xor = x^y; // highlight the differences with xor
//        int count = 0;
//        while(xor != 0){ // count the number of ones
//            xor = xor & (xor-1);
//            count ++;//
//        }
//        return count;
//
//    }
}
