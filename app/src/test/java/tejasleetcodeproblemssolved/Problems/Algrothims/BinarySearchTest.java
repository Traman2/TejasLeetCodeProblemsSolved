package tejasleetcodeproblemssolved.Problems.Algrothims;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test void targetInArray1() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 8;

        assertEquals(4, BinarySearch.binarySearchAlgrothim(sorted, target));
    }

    @Test void targetInArray2() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 4;

        assertEquals(2, BinarySearch.binarySearchAlgrothim(sorted, target));
    }

    @Test void targetNotInArray() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 20;

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, target));
    }

    @Test void emptyArrayReturnsNotFound() {
        int[] sorted = {};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 5));
    }

    @Test void singleElementArrayTargetPresent() {
        int[] sorted = {5};

        assertEquals(0, BinarySearch.binarySearchAlgrothim(sorted, 5));
    }

    @Test void singleElementArrayTargetAbsentSmaller() {
        int[] sorted = {5};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 3));
    }

    @Test void singleElementArrayTargetAbsentLarger() {
        int[] sorted = {5};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 8));
    }

    @Test void targetIsFirstElement() {
        int[] sorted = {2, 4, 6, 8, 10};

        assertEquals(0, BinarySearch.binarySearchAlgrothim(sorted, 2));
    }

    @Test void targetIsLastElement() {
        int[] sorted = {2, 4, 6, 8, 10};

        assertEquals(4, BinarySearch.binarySearchAlgrothim(sorted, 10));
    }

    @Test void targetSmallerThanAllElements() {
        int[] sorted = {10, 20, 30};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 5));
    }

    @Test void targetLargerThanAllElements() {
        int[] sorted = {10, 20, 30};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 100));
    }

    @Test void twoElementArrayTargetFirst() {
        int[] sorted = {4, 9};

        assertEquals(0, BinarySearch.binarySearchAlgrothim(sorted, 4));
    }

    @Test void twoElementArrayTargetSecond() {
        int[] sorted = {4, 9};

        assertEquals(1, BinarySearch.binarySearchAlgrothim(sorted, 9));
    }

    @Test void twoElementArrayTargetAbsentBetween() {
        int[] sorted = {4, 9};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 6));
    }

    @Test void negativeNumbersTargetPresent() {
        int[] sorted = {-10, -5, 0, 5, 10};

        assertEquals(1, BinarySearch.binarySearchAlgrothim(sorted, -5));
    }

    @Test void negativeNumbersTargetAbsent() {
        int[] sorted = {-10, -5, 0, 5, 10};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, -7));
    }

    @Test void duplicateElementsAllSameTargetMatches() {
        int[] sorted = {2, 2, 2, 2, 2};

        assertEquals(2, BinarySearch.binarySearchAlgrothim(sorted, 2));
    }

    @Test void duplicateElementsSurroundingTargetPresent() {
        int[] sorted = {1, 3, 3, 3, 5};

        assertEquals(2, BinarySearch.binarySearchAlgrothim(sorted, 3));
    }

    @Test void duplicateElementsAllSameTargetAbsent() {
        int[] sorted = {7, 7, 7, 7};

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 5));
    }

    @Test void arrayContainingZeroTargetIsZero() {
        int[] sorted = {-3, -1, 0, 2, 4};

        assertEquals(2, BinarySearch.binarySearchAlgrothim(sorted, 0));
    }

    @Test void largeSortedArrayTargetAtMiddle() {
        int[] sorted = new int[1000];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = i * 3;
        }

        assertEquals(500, BinarySearch.binarySearchAlgrothim(sorted, 1500));
    }

    @Test void largeSortedArrayTargetAbsentBetweenValues() {
        int[] sorted = new int[1000];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = i * 3;
        }

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, 1501));
    }

    @Test void extremeValuesBoundaryTargets() {
        int[] sorted = {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE};

        assertEquals(0, BinarySearch.binarySearchAlgrothim(sorted, Integer.MIN_VALUE));
        assertEquals(4, BinarySearch.binarySearchAlgrothim(sorted, Integer.MAX_VALUE));
    }

}
