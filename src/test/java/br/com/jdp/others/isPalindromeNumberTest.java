package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isPalindromeNumberTest {

    @Test
    void case1() {
        Assertions.assertThat(IsPalindromeNumber.isPalindrome(121)).isTrue();
    }

    @Test
    void case2() {
        Assertions.assertThat(IsPalindromeNumber.isPalindrome(-121)).isFalse();
    }

    @Test
    void case3() {
        Assertions.assertThat(IsPalindromeNumber.isPalindrome(10)).isFalse();
    }
}