package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    public void case1() {
        int[] nums = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(1,3,12,0,0);
    }

    @Test
    public void case2() {
        int[] nums = {0};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }
}