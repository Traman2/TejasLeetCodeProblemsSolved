package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinOnRotatedPivotTest {

    // Check normal case with pivot in the middle
    @Test void findMinLocatesPivotInMiddle() {
        assertEquals(10, FindMinOnRotatedPivot.findMin(new int[] {40, 50, 60, 10, 20}));
    }

    // Check case where array is not rotated at all
    @Test void findMinHandlesUnrotatedArray() {
        assertEquals(1, FindMinOnRotatedPivot.findMin(new int[] {1, 2, 3, 4, 5}));
    }

    // Check single element array
    @Test void findMinHandlesSingleElementArray() {
        assertEquals(5, FindMinOnRotatedPivot.findMin(new int[] {5}));
    }

    // Check two element array that is rotated
    @Test void findMinHandlesTwoElementRotatedArray() {
        assertEquals(1, FindMinOnRotatedPivot.findMin(new int[] {2, 1}));
    }

    // Check two element array that is not rotated
    @Test void findMinHandlesTwoElementUnrotatedArray() {
        assertEquals(1, FindMinOnRotatedPivot.findMin(new int[] {1, 2}));
    }

    // Check rotation by a single position (pivot near the end)
    @Test void findMinHandlesRotationByOnePosition() {
        assertEquals(1, FindMinOnRotatedPivot.findMin(new int[] {2, 3, 4, 5, 1}));
    }

    // Check rotation where minimum is the second element
    @Test void findMinHandlesMinimumNearStart() {
        assertEquals(1, FindMinOnRotatedPivot.findMin(new int[] {5, 1, 2, 3, 4}));
    }

    // Check larger rotated array
    @Test void findMinHandlesLargerRotatedArray() {
        assertEquals(0, FindMinOnRotatedPivot.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
    }

    // Check array of all negative numbers
    @Test void findMinHandlesNegativeNumbers() {
        assertEquals(-10, FindMinOnRotatedPivot.findMin(new int[] {-5, -3, -1, -10, -8}));
    }
}
