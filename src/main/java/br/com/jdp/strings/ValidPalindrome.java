package br.com.jdp.strings;

/**
 * time: O(n)
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            // find the next alpha numeric value for l pointer
            while ((l < r) && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            // find the next alpha numeric value for r pointer
            while ((l < r) && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            r--;
            l++;
        }

        return true;
    }

//    public static boolean isAlphaNumeric(char c) {
//        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
//    }

//    public boolean isPalindrome(String s) {
//        StringBuilder result = new StringBuilder();
//
//        // remove non-alphanumeric characters
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
//                result.append(Character.toLowerCase(c));
//            }
//        }
//
//        for (int i = 0; i < result.length(); i++) {
//            if (result.charAt(i) != result.charAt(result.length() - 1 - i)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
