package br.com.jdp.strings;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.strings.LongestPalindromicSubstring.longestPalindrome;

class LongestPalindromicSubstringTest {

    @Test
    void case1() {
        Assertions.assertThat(longestPalindrome("babad")).isEqualTo("aba");
    }

    @Test
    void case2() {
        Assertions.assertThat(longestPalindrome("cbbd")).isEqualTo("bb");
    }
}