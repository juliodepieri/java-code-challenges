package br.com.jdp.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerOfThreeTest {

    @Test
    void case1() {
        Assertions.assertThat(PowerOfThree.isPowerOfThree(3)).isTrue();
        Assertions.assertThat(PowerOfThree.isPowerOfThree(27)).isTrue();
        Assertions.assertThat(PowerOfThree.isPowerOfThree(243)).isTrue();
        Assertions.assertThat(PowerOfThree.isPowerOfThree(2187)).isTrue();

        Assertions.assertThat(PowerOfThree.isPowerOfThree(45)).isFalse();
        Assertions.assertThat(PowerOfThree.isPowerOfThree(0)).isFalse();
        Assertions.assertThat(PowerOfThree.isPowerOfThree(-1)).isFalse();
    }

}