package br.com.jdp.array;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void case1() {
        int[] nums = new int[]{3, 2, 2, 3};
        Assertions.assertThat(RemoveElement.removeElement(nums, 3)).isEqualTo(2);
    }

    @Test
    void case2() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        Assertions.assertThat(RemoveElement.removeElement(nums, 2)).isEqualTo(5);
    }

    @Test
    void case3() {
        int[] nums = new int[]{1};
        Assertions.assertThat(RemoveElement.removeElement(nums, 1)).isEqualTo(0);
    }

    @Test
    void case4() {
        int[] nums = new int[]{1,2};
        Assertions.assertThat(RemoveElement.removeElement(nums, 1)).isEqualTo(1);
    }

    @Test
    void case5() {
        int[] nums = new int[]{3,3,3};
        Assertions.assertThat(RemoveElement.removeElement(nums, 3)).isEqualTo(0);
    }
}