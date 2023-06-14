package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterTest {

    @Test
    public void case1() {
        String s = "leetcode";
        assertThat(new FirstUniqueCharacter().firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    public void case2() {
        String s = "loveleetcode";
        assertThat(new FirstUniqueCharacter().firstUniqChar(s)).isEqualTo(2);
    }

    @Test
    public void case3() {
        String s = "aabb";
        assertThat(new FirstUniqueCharacter().firstUniqChar(s)).isEqualTo(-1);
    }
}