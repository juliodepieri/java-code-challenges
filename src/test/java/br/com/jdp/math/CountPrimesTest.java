package br.com.jdp.math;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CountPrimesTest {

    @Test
    void case1() {
        Assertions.assertThat(CountPrimes.countPrimes(10)).isEqualTo(4);
    }
}