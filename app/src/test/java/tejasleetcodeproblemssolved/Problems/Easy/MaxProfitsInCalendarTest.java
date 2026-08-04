package tejasleetcodeproblemssolved.Problems.Easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxProfitsInCalendarTest {

    // Check normal case with a dip then a rise, matching the example in main()
    @Test void maxProfitReturnsBestProfitAfterDip() {
        assertEquals(6, MaxProfitsInCalendar.maxProfit(new int[] {10, 1, 5, 6, 7, 1}));
    }

    // Check classic increasing-then-decreasing case
    @Test void maxProfitHandlesRiseThenFall() {
        assertEquals(5, MaxProfitsInCalendar.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    // Check case where prices strictly decrease, so no profit is possible
    @Test void maxProfitReturnsZeroForStrictlyDecreasingPrices() {
        assertEquals(0, MaxProfitsInCalendar.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

    // Check case where prices strictly increase, so best profit is buy first sell last
    @Test void maxProfitHandlesStrictlyIncreasingPrices() {
        assertEquals(4, MaxProfitsInCalendar.maxProfit(new int[] {1, 2, 3, 4, 5}));
    }

    // Check case with a single price, no transaction possible
    @Test void maxProfitReturnsZeroForSinglePrice() {
        assertEquals(0, MaxProfitsInCalendar.maxProfit(new int[] {5}));
    }

    // Check case with an empty array
    @Test void maxProfitReturnsZeroForEmptyArray() {
        assertEquals(0, MaxProfitsInCalendar.maxProfit(new int[] {}));
    }

    // Check case where all prices are equal, no profit possible
    @Test void maxProfitReturnsZeroForAllEqualPrices() {
        assertEquals(0, MaxProfitsInCalendar.maxProfit(new int[] {3, 3, 3, 3}));
    }

    // Check case with multiple dips, best profit comes from the lowest valley to a later peak
    @Test void maxProfitHandlesMultipleDips() {
        assertEquals(8, MaxProfitsInCalendar.maxProfit(new int[] {9, 1, 4, 2, 8, 1, 9}));
    }
}