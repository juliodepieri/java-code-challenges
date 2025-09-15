package br.com.jdp.others;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HammingDistanceTest {

    @Test
    void case1() {
        Assertions.assertThat(HammingDistance.hammingDistance(1, 2)).isEqualTo(2);
    }

    @Test
    void case2() {
        Assertions.assertThat(HammingDistance.hammingDistance(1, 3)).isEqualTo(1);
    }
}