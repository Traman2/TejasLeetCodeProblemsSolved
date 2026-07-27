package tejasleetcodeproblemssolved.Problems.Samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputeFibbernachiTest {

    // Check base cases where index is 1 or 2
    @Test void fibCalculatorReturnsOneForFirstTwoIndices() {
        assertEquals(1, ComputeFibbernachi.fibCalculator(1));
        assertEquals(1, ComputeFibbernachi.fibCalculator(2));
    }

    // Check normal case for small indices
    @Test void fibCalculatorReturnsExpectedValueForSmallIndices() {
        assertEquals(2, ComputeFibbernachi.fibCalculator(3));
        assertEquals(3, ComputeFibbernachi.fibCalculator(4));
        assertEquals(5, ComputeFibbernachi.fibCalculator(5));
    }

    // Check normal case for larger index
    @Test void fibCalculatorReturnsExpectedValueForLargerIndices() {
        assertEquals(8, ComputeFibbernachi.fibCalculator(6));
        assertEquals(13, ComputeFibbernachi.fibCalculator(7));
        assertEquals(21, ComputeFibbernachi.fibCalculator(8));
    }
}