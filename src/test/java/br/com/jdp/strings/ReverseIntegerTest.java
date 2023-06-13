package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

    @Test
    public void case1() {
        assertThat(new ReverseInteger().reverse(123)).isEqualTo(321);
    }

    @Test
    public void case2() {
        assertThat(new ReverseInteger().reverse(-123)).isEqualTo(-321);
    }

    @Test
    public void case3() {
        assertThat(new ReverseInteger().reverse(120)).isEqualTo(21);
    }
}