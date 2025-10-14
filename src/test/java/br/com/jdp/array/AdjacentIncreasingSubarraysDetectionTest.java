package br.com.jdp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static br.com.jdp.array.AdjacentIncreasingSubarraysDetection.hasIncreasingSubarrays;


class AdjacentIncreasingSubarraysDetectionTest {

    @Test
    void case1() {
        List<Integer> nums = List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 3)).isTrue();
    }

    @Test
    void case2() {
        List<Integer> nums = List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 5)).isFalse();
    }

    @Test
    void case3() {
        List<Integer> nums = List.of(-15, 19);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 1)).isTrue();
    }

    @Test
    void case4() {
        List<Integer> nums = List.of(19,5);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 1)).isTrue();
    }

    @Test
    void case5() {
        List<Integer> nums = List.of(5,8,-2,-1);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 2)).isTrue();
    }

    @Test
    void case6() {
        List<Integer> nums = List.of(-17,-20,-3,-12,-16);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 2)).isFalse();
    }

    @Test
    void case7() {
        List<Integer> nums = List.of(0,-19,-18,12,-20,-16);
        Assertions.assertThat(hasIncreasingSubarrays(nums, 3)).isFalse();
    }
}