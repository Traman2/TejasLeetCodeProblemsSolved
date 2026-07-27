package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Note: topKFrequent's sort only orders by count, so when two elements tie on
// frequency their relative order in the result is unspecified. All cases below
// use distinct frequency counts (no ties) to keep the expected order deterministic.
class MediumTopKFrequencyTest {

    // Check normal case with three distinct frequencies
    @Test void topKFrequentReturnsMostFrequentElementsDescending() {
        assertArrayEquals(new int[] {3, 2}, MediumTopKFrequency.topKFrequent(new int[] {1,2,2,3,3,3}, 2));
    }

    // Check k covering all distinct elements
    @Test void topKFrequentReturnsAllDistinctElementsWhenKEqualsDistinctCount() {
        assertArrayEquals(new int[] {5, 6, 7}, MediumTopKFrequency.topKFrequent(new int[] {5,5,5,6,6,7}, 3));
    }

    // Check single distinct element repeated
    @Test void topKFrequentHandlesSingleDistinctElement() {
        assertArrayEquals(new int[] {8}, MediumTopKFrequency.topKFrequent(new int[] {8,8,8,8}, 1));
    }

    // Check k = 1 picks the single most frequent element among several
    @Test void topKFrequentReturnsOnlyMostFrequentElementWhenKIsOne() {
        assertArrayEquals(new int[] {20}, MediumTopKFrequency.topKFrequent(new int[] {10,20,20,20,20,30,30}, 1));
    }

    // Check negative numbers are counted correctly
    @Test void topKFrequentHandlesNegativeNumbers() {
        assertArrayEquals(new int[] {-1, -2}, MediumTopKFrequency.topKFrequent(new int[] {-1,-1,-2}, 2));
    }
}
