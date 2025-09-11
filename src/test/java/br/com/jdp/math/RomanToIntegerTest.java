package br.com.jdp.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void case1() {
        Assertions.assertThat(RomanToInteger.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void case2() {
        Assertions.assertThat(RomanToInteger.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void case3() {
        Assertions.assertThat(RomanToInteger.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

}