package br.com.jdp.strings;

/**
 * time: O(n * m)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/885/
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
