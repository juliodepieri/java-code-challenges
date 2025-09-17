package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    void case1() {
        Assertions.assertThat(ReverseBits.reverseBits(43261596)).isEqualTo(964176192);
    }

    @Test
    void case2() {
        Assertions.assertThat(ReverseBits.reverseBits(2147483644)).isEqualTo(1073741822);
    }
}