package br.com.jdp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    @Test
    public void case1() {
        int[] digits = {1, 2, 3};
        Assertions.assertThat(new PlusOne().plusOne(digits)).contains(1, 2, 4);
    }

    @Test
    public void case2() {
        int[] digits = {4, 3, 2, 1};
        Assertions.assertThat(new PlusOne().plusOne(digits)).contains(4, 3, 2, 2);
    }

    @Test
    public void case3() {
        int[] digits = {9};
        Assertions.assertThat(new PlusOne().plusOne(digits)).contains(1, 0);
    }

    @Test
    public void case4() {
        int[] digits = {9, 9};
        Assertions.assertThat(new PlusOne().plusOne(digits)).contains(1, 0, 0);
    }
}