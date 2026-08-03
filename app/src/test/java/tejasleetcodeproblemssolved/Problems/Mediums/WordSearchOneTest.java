package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchOneTest {

    private static final char[][] CLASSIC_BOARD = {
                    {'A','B','C','E'},
                    {'S','F','C','S'},
                    {'A','D','E','E'}
                    };

    // Check word found along a path with turns but no need to backtrack
    @Test void existFindsWordAlongPathWithTurns() {
        assertTrue(WordSearchOne.exist(CLASSIC_BOARD, "ABCCED"));
    }

    // Check word found by choosing the correct branch among repeated letters
    @Test void existFindsWordRequiringCorrectBranchChoice() {
        assertTrue(WordSearchOne.exist(CLASSIC_BOARD, "SEE"));
    }

    // Check word not found when the only path would reuse an already visited cell
    @Test void existReturnsFalseWhenWordRequiresReusingCell() {
        assertFalse(WordSearchOne.exist(CLASSIC_BOARD, "ABCB"));
    }

    // Check word found starting from a different board with multiple candidate start letters
    @Test void existFindsWordAmongMultipleCandidateStarts() {
        char[][] board = {
                        {'A','B','C','D'},
                        {'S','A','A','T'},
                        {'A','C','A','E'}
                        };
        assertTrue(WordSearchOne.exist(board, "CAT"));
    }

    // Check word not found when no path completes the full word
    @Test void existReturnsFalseWhenWordNotPresent() {
        char[][] board = {
                        {'A','B','C','D'},
                        {'S','A','A','T'},
                        {'A','C','A','E'}
                        };
        assertFalse(WordSearchOne.exist(board, "CATS"));
    }

    // Check single cell board matching a single letter word
    @Test void existHandlesSingleCellMatch() {
        char[][] board = {{'A'}};
        assertTrue(WordSearchOne.exist(board, "A"));
    }

    // Check single cell board not matching the word
    @Test void existHandlesSingleCellMismatch() {
        char[][] board = {{'A'}};
        assertFalse(WordSearchOne.exist(board, "B"));
    }

    // Check word longer than the number of cells available on the board
    @Test void existReturnsFalseWhenWordLongerThanBoard() {
        char[][] board = {{'A'}};
        assertFalse(WordSearchOne.exist(board, "AB"));
    }

    // Check board is restored to its original state after a search, since dfs mutates cells during traversal
    @Test void existLeavesBoardUnmodifiedAfterSearch() {
        char[][] board = {
                        {'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}
                        };
        char[][] original = {
                        {'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}
                        };

        WordSearchOne.exist(board, "ABCCED");

        assertArrayEquals(original, board);
    }
}
