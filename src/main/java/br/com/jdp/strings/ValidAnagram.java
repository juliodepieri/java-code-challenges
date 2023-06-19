package br.com.jdp.strings;

/**
 * time: O(n)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/882/
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alphabets = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
