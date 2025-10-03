package br.com.jdp.others;

public class IsPalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverseNum = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reverseNum = reverseNum * 10 + digit;
            temp = temp / 10;
        }

        return reverseNum == x;
    }
}
