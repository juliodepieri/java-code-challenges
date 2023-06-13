package br.com.jdp.strings;

/**
 * time: O(log(n)) where n is the number of digits in the given integer. Because there are only log(n) digits in a number n
 * space: O(1)
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/880/
 */
public class ReverseInteger {
    public int reverse(int x) {
        long res = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && digit >= Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 ||
                    (res == Integer.MIN_VALUE / 10 && digit <= Integer.MIN_VALUE % 10)) {
                return 0;
            }

            res = (res * 10) + digit;
        }

        return (int) res;
    }
}
