package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediumStackEvaluateRPNTest {

    // Check normal case combining all four operators
    @Test void evalRPNHandlesAllOperators() {
        assertEquals(5, MediumStackEvaluateRPN.evalRPN(new String[] {"1","2","+","3","*","4","-"}));
    }

    // Check simple addition
    @Test void evalRPNHandlesAddition() {
        assertEquals(9, MediumStackEvaluateRPN.evalRPN(new String[] {"4","5","+"}));
    }

    // Check simple subtraction, order of operands matters
    @Test void evalRPNHandlesSubtractionOperandOrder() {
        assertEquals(-1, MediumStackEvaluateRPN.evalRPN(new String[] {"4","5","-"}));
    }

    // Check simple division, order of operands matters
    @Test void evalRPNHandlesDivisionOperandOrder() {
        assertEquals(2, MediumStackEvaluateRPN.evalRPN(new String[] {"10","5","/"}));
    }

    // Check single number with no operators
    @Test void evalRPNHandlesSingleNumber() {
        assertEquals(42, MediumStackEvaluateRPN.evalRPN(new String[] {"42"}));
    }

    // Check negative numbers as tokens
    @Test void evalRPNHandlesNegativeNumberTokens() {
        assertEquals(-3, MediumStackEvaluateRPN.evalRPN(new String[] {"-1","-2","+"}));
    }

    // Check integer division truncates toward zero
    @Test void evalRPNHandlesIntegerDivisionTruncation() {
        assertEquals(1, MediumStackEvaluateRPN.evalRPN(new String[] {"7","4","/"}));
    }
}
