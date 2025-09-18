package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;

class PascalTriangleTest {

    @Test
    void case1() {
        List<List<Integer>> expected = of(
                of(1),
                of(1, 1),
                of(1, 2, 1),
                of(1, 3, 3, 1),
                of(1, 4, 6, 4, 1)
        );
        Assertions.assertThat(PascalTriangle.generate(5)).isEqualTo(expected);
    }

    @Test
    void case2() {
        List<List<Integer>> expected = of(of(1));
        Assertions.assertThat(PascalTriangle.generate(1)).isEqualTo(expected);
    }

}