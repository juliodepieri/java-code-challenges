package br.com.jdp.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.math.IntegerToRoman.intToRoman;

class IntegerToRomanTest {

    @Test
    void case1() {
        Assertions.assertThat(intToRoman(3999 )).isEqualTo("MMMCMXCIX");
    }

    @Test
    void case2() {
        Assertions.assertThat(intToRoman(800 )).isEqualTo("DCCC");
    }

    @Test
    void case3() {
        Assertions.assertThat(intToRoman(9 )).isEqualTo("IX");
    }

    @Test
    void case4() {
        Assertions.assertThat(intToRoman(1 )).isEqualTo("I");
    }
}