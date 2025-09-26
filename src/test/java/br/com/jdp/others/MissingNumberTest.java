package br.com.jdp.others;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MissingNumberTest {

    @Test
    void case1() {
        Assertions.assertThat(MissingNumber.missingNumber(new int[]{3,0,1})).isEqualTo(2);
    }

}