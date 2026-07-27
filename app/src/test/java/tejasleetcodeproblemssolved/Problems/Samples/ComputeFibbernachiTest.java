package tejasleetcodeproblemssolved.Problems.Samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

class ComputeFibbernachiTest {

    // Check base cases where index is 1 or 2
    @Test void fibCalculatorReturnsOneForFirstTwoIndices() {
        assertEquals(BigInteger.valueOf(1), ComputeFibbernachi.fibCalculator(1));
        assertEquals(BigInteger.valueOf(1), ComputeFibbernachi.fibCalculator(2));
    }

    // Check normal case for small indices
    @Test void fibCalculatorReturnsExpectedValueForSmallIndices() {
        assertEquals(BigInteger.valueOf(2), ComputeFibbernachi.fibCalculator(3));
        assertEquals(BigInteger.valueOf(3), ComputeFibbernachi.fibCalculator(4));
        assertEquals(BigInteger.valueOf(5), ComputeFibbernachi.fibCalculator(5));
    }

    // Check normal case for larger index
    @Test void fibCalculatorReturnsExpectedValueForLargerIndices() {
        assertEquals(BigInteger.valueOf(8), ComputeFibbernachi.fibCalculator(6));
        assertEquals(BigInteger.valueOf(13), ComputeFibbernachi.fibCalculator(7));
        assertEquals(BigInteger.valueOf(21), ComputeFibbernachi.fibCalculator(8));
    }
}