package br.com.jdp.array;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static br.com.jdp.array.MaxFrequencyElementOperationsII.maxFrequency;

class MaxFrequencyElementOperationsIITest {

    @Test
    void case1() {
        int[] nums = new int[]{1, 4, 5};
        int k = 1;
        int numOperations = 2;
        Assertions.assertThat(maxFrequency(nums, k, numOperations)).isEqualTo(2);
    }

    @Test
    void case2() {
        int[] nums = new int[]{5, 11, 20, 20};
        int k = 5;
        int numOperations = 1;
        Assertions.assertThat(maxFrequency(nums, k, numOperations)).isEqualTo(2);
    }

    @Test
    void case3() {
        int[] nums = new int[]{94,10};
        int k = 51;
        int numOperations = 1;
        Assertions.assertThat(maxFrequency(nums, k, numOperations)).isEqualTo(1);
    }

    @Test
    void case4() {
        int[] nums = new int[]{93,45};
        int k = 1;
        int numOperations = 2;
        Assertions.assertThat(maxFrequency(nums, k, numOperations)).isEqualTo(1);
    }
}