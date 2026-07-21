package tejasleetcodeproblemssolved.Problems.Algrothims;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test void TargetInArray1() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 8;

        assertEquals(4, BinarySearch.binarySearchAlgrothim(sorted, target));
    }

    @Test void TargetInArray2() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 4;

        assertEquals(2, BinarySearch.binarySearchAlgrothim(sorted, target));
    }

    @Test void TargetNotInArray() {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 20;

        assertEquals(-1, BinarySearch.binarySearchAlgrothim(sorted, target));
    }
    
}
