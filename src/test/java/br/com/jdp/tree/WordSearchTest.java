package br.com.jdp.tree;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {

    @Test
    void case1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        Assertions.assertThat(WordSearch.exist(board, word)).isTrue();
    }

    @Test
    void case2() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        Assertions.assertThat(WordSearch.exist(board, word)).isFalse();
    }

}