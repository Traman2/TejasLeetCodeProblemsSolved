package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    // Check grid with multiple disconnected islands including diagonal-only touching land
    @Test void numIslandsHandlesMultipleIslands() {
        char[][] grid = {
                        {'0','1','1','1','0'},
                        {'0','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','1','1','0','1'}
                        };
        assertEquals(2, NumberOfIslands.numIslands(grid));
    }

    // Check grid with several separate islands, some touching only diagonally
    @Test void numIslandsHandlesDiagonallyAdjacentIslands() {
        char[][] grid = {
                        {'1','1','0','0','1'},
                        {'1','1','0','0','1'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                        };
        assertEquals(4, NumberOfIslands.numIslands(grid));
    }

    // Check grid with no land at all
    @Test void numIslandsHandlesAllWater() {
        char[][] grid = {
                        {'0','0','0'},
                        {'0','0','0'},
                        {'0','0','0'}
                        };
        assertEquals(0, NumberOfIslands.numIslands(grid));
    }

    // Check grid that is entirely one connected island
    @Test void numIslandsHandlesAllLand() {
        char[][] grid = {
                        {'1','1','1'},
                        {'1','1','1'},
                        {'1','1','1'}
                        };
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    // Check single cell grid that is land
    @Test void numIslandsHandlesSingleLandCell() {
        char[][] grid = {{'1'}};
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    // Check single cell grid that is water
    @Test void numIslandsHandlesSingleWaterCell() {
        char[][] grid = {{'0'}};
        assertEquals(0, NumberOfIslands.numIslands(grid));
    }

    // Check single row grid with multiple islands
    @Test void numIslandsHandlesSingleRowGrid() {
        char[][] grid = {{'1','0','1','0','1'}};
        assertEquals(3, NumberOfIslands.numIslands(grid));
    }

    // Check single column grid with multiple islands
    @Test void numIslandsHandlesSingleColumnGrid() {
        char[][] grid = {{'1'},{'0'},{'1'},{'1'},{'0'}};
        assertEquals(2, NumberOfIslands.numIslands(grid));
    }

    // Check large fully connected land mass to ensure no stack overflow with iterative DFS
    @Test void numIslandsHandlesLargeConnectedGrid() {
        int size = 100;
        char[][] grid = new char[size][size];
        for (char[] row : grid) {
            java.util.Arrays.fill(row, '1');
        }
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }
}