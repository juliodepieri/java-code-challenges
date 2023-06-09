package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateImageTest {

    @Test
    public void case1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage().rotate(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }

    @Test
    public void case2() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new RotateImage().rotate(matrix);
        assertThat(matrix).isDeepEqualTo(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}});
    }

}