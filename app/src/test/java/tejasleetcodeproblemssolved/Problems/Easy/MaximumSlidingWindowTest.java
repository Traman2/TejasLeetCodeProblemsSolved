package tejasleetcodeproblemssolved.Problems.Easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSlidingWindowTest {

    // Check normal case with multiple candidate windows
    @Test void maxSlidingWindowReturnsLargestWindowSum() {
        assertEquals(81, MaximumSlidingWindow.MaxSlidingWindowSolution(new int[] {10, 2, 40, 20, 13, 45, 23}, 3));
    }

    // Check case where the best window is at the end of the array
    @Test void maxSlidingWindowFindsBestWindowAtEnd() {
        assertEquals(9, MaximumSlidingWindow.MaxSlidingWindowSolution(new int[] {1, 2, 3, 4, 5}, 2));
    }

    // Check case where window size equals array length
    @Test void maxSlidingWindowHandlesWindowEqualToArrayLength() {
        assertEquals(16, MaximumSlidingWindow.MaxSlidingWindowSolution(new int[] {4, 4, 4, 4}, 4));
    }

    // Check case where window size is 1, single element array
    @Test void maxSlidingWindowHandlesSingleElementArray() {
        assertEquals(5, MaximumSlidingWindow.MaxSlidingWindowSolution(new int[] {5}, 1));
    }

    // Check case with all negative numbers
    @Test void maxSlidingWindowHandlesAllNegativeNumbers() {
        assertEquals(-3, MaximumSlidingWindow.MaxSlidingWindowSolution(new int[] {-1, -2, -3, -4}, 2));
    }
}