package br.com.jdp.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int curr = 0;
        int prev = 0;
        Map<Character, Integer> hash = new HashMap<>();

        while (curr < s.length()) {
            if (hash.containsKey(s.charAt(curr))) {
                prev = Math.max(prev, hash.get(s.charAt(curr)) + 1);
                hash.replace(s.charAt(curr), curr);
            } else {
                hash.put(s.charAt(curr), curr);
            }

            max= Math.max(max, curr - prev + 1);
            curr++;
        }

        return max;
    }

}
