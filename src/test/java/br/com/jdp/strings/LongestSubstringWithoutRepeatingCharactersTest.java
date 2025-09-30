package br.com.jdp.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.strings.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void case1() {
        Assertions.assertThat(lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

    @Test
    void case2() {
        Assertions.assertThat(lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }

    @Test
    void case3() {
        Assertions.assertThat(lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    void case4() {
        Assertions.assertThat(lengthOfLongestSubstring(" ")).isEqualTo(1);
    }

    @Test
    void case5() {
        Assertions.assertThat(lengthOfLongestSubstring("dvdf")).isEqualTo(3);
    }
}