package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    @Test
    public void case1() {
        String[] str = {"flower", "flow", "flight"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(str)).isEqualTo("fl");
    }

    @Test
    public void case2() {
        String[] str = {"dog", "racecar", "car"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(str)).isEmpty();
    }

}