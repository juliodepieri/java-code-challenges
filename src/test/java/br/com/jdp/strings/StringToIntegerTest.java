package br.com.jdp.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {

    @Test
    public void case1() {
        String s = "42";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(42);
    }

    @Test
    public void case2() {
        String s = "   -42";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(-42);
    }

    @Test
    public void case3() {
        String s = "4193 with words";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(4193);
    }

    @Test
    public void case4() {
        String s = "words and 987";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case5() {
        String s = "2147483648  ";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(2147483647);
    }

    @Test
    public void case6() {
        String s = "-91283472332";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(-2147483648);
    }

    @Test
    public void case7() {
        String s = "+-12";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case8() {
        String s = "  -0012a42";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(-12);
    }

    @Test
    public void case9() {
        String s = "+";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case10() {
        String s = "00000-42a1234";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case11() {
        String s = "   +0 123";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case12() {
        String s = "9223372036854775808";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(2147483647);
    }

    @Test
    public void case13() {
        String s = "  +  413";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(0);
    }

    @Test
    public void case14() {
        String s = "    -88827   5655  U";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(-88827);
    }

    @Test
    public void case15() {
        String s = "    +11191657170";
        assertThat(new StringToInteger().myAtoi(s)).isEqualTo(2147483647);
    }
}