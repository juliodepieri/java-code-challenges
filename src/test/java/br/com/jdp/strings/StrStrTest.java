package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StrStrTest {

    @Test
    public void case1() {
        var haystack  = "sadbutsad";
        var needle = "sad";
        assertThat(new StrStr().strStr(haystack, needle)).isEqualTo(0);
    }

    @Test
    public void case2() {
        var haystack  = "leetcode";
        var needle = "leeto";
        assertThat(new StrStr().strStr(haystack, needle)).isEqualTo(-1);
    }

    @Test
    public void case3() {
        var haystack  = "afcfggde";
        var needle = "fgg";
        assertThat(new StrStr().strStr(haystack, needle)).isEqualTo(3);
    }

    @Test
    public void case4() {
        var haystack  = "mississippi";
        var needle = "issip";
        assertThat(new StrStr().strStr(haystack, needle)).isEqualTo(4);
    }

}