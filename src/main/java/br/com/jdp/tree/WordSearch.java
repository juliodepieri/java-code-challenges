package br.com.jdp.tree;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int r, int c, int index) {
        // All characters matched
        if (index == word.length()) return true;

        // Out of bounds or mismatch
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length
            || board[r][c] != word.charAt(index)) {
            return false;
        }

        // Mark visited by temporarily changing the character
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore all 4 directions
        boolean found =
                dfs(board, word, r + 1, c, index + 1)
                || dfs(board, word, r - 1, c, index + 1)
                || dfs(board, word, r, c + 1, index + 1)
                || dfs(board, word, r, c - 1, index + 1);

        // Restore character (backtracking)
        board[r][c] = temp;

        return found;
    }
}
