package br.com.jdp.strings;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/
 */
public class StringToInteger {
    public int myAtoi(String s) {
        if (s.trim().equals("")) {
            return 0;
        }

        long result = -1;
        int signPos = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (signPos != -1 && c != ' ' && !Character.isDigit(c)) {
                break;
            }
            if ((c == '-' || c == '+') && result == -1) {
                signPos = i;
            } else if (!Character.isDigit(c) && (signPos != -1 || (c != ' ' && result == -1))) {
                break;
            } else if (Character.isDigit(c)) {
                if (result == -1) {
                    result = 0;
                }
                result = (result * 10) + Character.getNumericValue(c);

                if (result > Integer.MAX_VALUE) {
                    return (signPos != -1 && s.charAt(signPos) == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else if (result != -1) {
                break;
            }
        }

        if (result == -1) {
            return 0;
        } else if (signPos != -1 && s.charAt(signPos) == '-') {
            result *= -1;
        }

        return (int) result;
    }


}
