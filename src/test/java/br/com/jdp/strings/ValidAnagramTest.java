package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    @Test
    public void case1() {
        assertThat(new ValidAnagram().isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    public void case2() {
        assertThat(new ValidAnagram().isAnagram("rat", "car")).isFalse();
    }

}