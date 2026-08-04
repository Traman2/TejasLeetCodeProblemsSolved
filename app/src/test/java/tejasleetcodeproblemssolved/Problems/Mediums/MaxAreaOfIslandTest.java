package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {

    // Check grid with an irregularly shaped largest island, matching the example in main()
    @Test void maxIslandAreaHandlesIrregularShape() {
        int[][] grid = {
                        {0,1,1,1,0},
                        {0,1,0,1,0},
                        {1,1,0,0,0},
                        {0,0,0,0,0}
                        };
        assertEquals(7, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check grid with multiple islands of different sizes, matching the example in main()
    @Test void maxIslandAreaHandlesMultipleIslandsOfDifferentSizes() {
        int[][] grid = {
                        {1,1,0,0,1},
                        {1,1,0,0,1},
                        {0,0,1,0,0},
                        {0,0,0,1,1}
                        };
        assertEquals(4, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check grid with no land at all
    @Test void maxIslandAreaHandlesAllWater() {
        int[][] grid = {
                        {0,0,0},
                        {0,0,0},
                        {0,0,0}
                        };
        assertEquals(0, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check grid that is entirely one connected island
    @Test void maxIslandAreaHandlesAllLand() {
        int[][] grid = {
                        {1,1,1},
                        {1,1,1},
                        {1,1,1}
                        };
        assertEquals(9, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check single cell grid that is land
    @Test void maxIslandAreaHandlesSingleLandCell() {
        int[][] grid = {{1}};
        assertEquals(1, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check single cell grid that is water
    @Test void maxIslandAreaHandlesSingleWaterCell() {
        int[][] grid = {{0}};
        assertEquals(0, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check single row grid with multiple islands of different sizes
    @Test void maxIslandAreaHandlesSingleRowGrid() {
        int[][] grid = {{1,1,0,1,0,1,1,1}};
        assertEquals(3, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check single column grid with multiple islands of different sizes
    @Test void maxIslandAreaHandlesSingleColumnGrid() {
        int[][] grid = {{1},{1},{0},{1},{0},{1},{1}};
        assertEquals(2, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check grid where islands only touch diagonally, so they must not be merged
    @Test void maxIslandAreaDoesNotMergeDiagonalIslands() {
        int[][] grid = {
                        {1,0,1},
                        {0,1,0},
                        {1,0,1}
                        };
        assertEquals(1, MaxAreaOfIsland.maxIslandArea(grid));
    }

    // Check large fully connected land mass to ensure no stack overflow with recursive DFS
    @Test void maxIslandAreaHandlesLargeConnectedGrid() {
        int size = 20;
        int[][] grid = new int[size][size];
        for (int[] row : grid) {
            java.util.Arrays.fill(row, 1);
        }
        assertEquals(size * size, MaxAreaOfIsland.maxIslandArea(grid));
    }
}
