package br.com.jdp.strings;

/**
 * time: O(n)
 * memory: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;

        while (i < j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }

}
