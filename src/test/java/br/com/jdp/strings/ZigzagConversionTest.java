package br.com.jdp.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigzagConversionTest {

    @Test
    void case1() {
        Assertions.assertThat(ZigzagConversion.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void case2() {
        Assertions.assertThat(ZigzagConversion.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
    }

}