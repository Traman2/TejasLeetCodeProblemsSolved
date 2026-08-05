package tejasleetcodeproblemssolved.Problems.Easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockIncreasingFrequencyTest {

    // Check normal case with multiple separate increasing streaks, matching the example in main()
    @Test void solutionMatchesMainExample() {
        int[] arr = {1, 2, 4, 6, 16, 3, 6, 12, 20, 25, 28, 1, 2, 3};
        assertEquals(8, StockIncreasingFrequency.solution(arr, 3));
    }

    // Check case where the array is shorter than k, so no streak can ever qualify
    @Test void solutionReturnsZeroWhenArrayShorterThanK() {
        assertEquals(0, StockIncreasingFrequency.solution(new int[] {1, 2}, 5));
    }

    // Check strictly increasing array whose length exactly equals k
    @Test void solutionHandlesStrictlyIncreasingArrayExactLengthK() {
        assertEquals(1, StockIncreasingFrequency.solution(new int[] {1, 2, 3}, 3));
    }

    // Check strictly decreasing array, where the streak never reaches k
    @Test void solutionHandlesStrictlyDecreasingArray() {
        assertEquals(0, StockIncreasingFrequency.solution(new int[] {5, 4, 3, 2, 1}, 2));
    }

    // Check array of all equal elements, since equal values do not extend the streak
    @Test void solutionHandlesAllEqualElements() {
        assertEquals(0, StockIncreasingFrequency.solution(new int[] {4, 4, 4, 4}, 2));
    }

    // Check k = 1, which should count every adjacent pair in the array
    @Test void solutionHandlesKOfOneCountsEveryAdjacentPair() {
        assertEquals(3, StockIncreasingFrequency.solution(new int[] {5, 3, 3, 7}, 1));
    }

    // Check single element array with k = 1, where no adjacent pair exists to compare
    @Test void solutionHandlesSingleElementArrayWithKOfOne() {
        assertEquals(0, StockIncreasingFrequency.solution(new int[] {9}, 1));
    }

    // Check two separate increasing streaks that each exactly reach length k
    @Test void solutionHandlesMultipleSeparateStreaksOfExactLengthK() {
        assertEquals(2, StockIncreasingFrequency.solution(new int[] {1, 2, 3, 1, 2, 3}, 3));
    }

    // Check a single long increasing streak longer than k, which should count once per position past the threshold
    @Test void solutionHandlesSingleLongStreakPastThreshold() {
        assertEquals(3, StockIncreasingFrequency.solution(new int[] {1, 2, 3, 4, 5}, 3));
    }
}
