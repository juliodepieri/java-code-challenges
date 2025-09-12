package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOf1BitTest {

    @Test
    void case1() {
        Assertions.assertThat(NumberOf1Bit.hammingWeight(11)).isEqualTo(3);
    }

    @Test
    void case2() {
        Assertions.assertThat(NumberOf1Bit.hammingWeight(128)).isEqualTo(1);
    }

    @Test
    void case3() {
        Assertions.assertThat(NumberOf1Bit.hammingWeight(2147483645)).isEqualTo(30);
    }
}