package br.com.jdp.others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.others.ContainerWithMostWater.maxArea;

class ContainerWithMostWaterTest {

    @Test
    void case1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assertions.assertThat(maxArea(height)).isEqualTo(49);
    }

    @Test
    void case2() {
        int[] height = {1, 1};
        Assertions.assertThat(maxArea(height)).isEqualTo(1);
    }
}