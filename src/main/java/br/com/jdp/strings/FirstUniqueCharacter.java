package br.com.jdp.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * time: O(n)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
 */
public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        // s consists of only lowercase English letters
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
//    public int firstUniqChar(String s) {
//        Map<Character, Integer> count = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (count.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
}
