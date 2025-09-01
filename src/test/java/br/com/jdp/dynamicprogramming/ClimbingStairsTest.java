package br.com.jdp.dynamicprogramming;

import br.com.jdp.array.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @Test
    public void case1() {
        int result = ClimbingStairs.climbStairs(2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void case2() {
        int result = ClimbingStairs.climbStairs(3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void case3() {
        int result = ClimbingStairs.climbStairs(4);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void case4() {
        int result = ClimbingStairs.climbStairs(5);
        assertThat(result).isEqualTo(8);
    }
}