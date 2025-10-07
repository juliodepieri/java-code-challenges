package br.com.jdp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void case1() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
    }

    @Test
    void case2() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
    }

    @Test
    void case3() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
    }

    @Test
    void case4() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{2, 3, 5, 6}, 1)).isEqualTo(0);
    }

    @Test
    void case5() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{1,3}, 2)).isEqualTo(1);
    }

    @Test
    void case6() {
        Assertions.assertThat(SearchInsertPosition.searchInsert(new int[]{1,3}, 3)).isEqualTo(1);
    }

}