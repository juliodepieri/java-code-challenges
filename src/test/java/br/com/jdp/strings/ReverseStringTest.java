package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {

    @Test
    public void case1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(s);
        assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    public void case2() {
        char[] s = {'H','a','n','n','a', 'h'};
        new ReverseString().reverseString(s);
        assertThat(s).containsExactly('h','a','n','n','a','H');
    }

}