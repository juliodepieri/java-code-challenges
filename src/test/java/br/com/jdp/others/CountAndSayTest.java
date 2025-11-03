package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.others.CountAndSay.countAndSay;

class CountAndSayTest {

    @Test
    void case1() {
        Assertions.assertThat(countAndSay(4)).isEqualTo("1211");
    }

}