package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestNonRepeatingSubStringTest {

    // Check normal case with a repeated character partway through
    @Test void lengthOfLongestSubstringHandlesRepeatedCharacter() {
        assertEquals(3, LongestNonRepeatingSubString.lengthOfLongestSubstring("abcabcbb"));
    }

    // Check case where all characters are the same
    @Test void lengthOfLongestSubstringHandlesAllSameCharacters() {
        assertEquals(1, LongestNonRepeatingSubString.lengthOfLongestSubstring("bbbbb"));
    }

    // Check case with no repeating characters
    @Test void lengthOfLongestSubstringHandlesNoRepeats() {
        assertEquals(6, LongestNonRepeatingSubString.lengthOfLongestSubstring("abcdef"));
    }

    // Check empty string
    @Test void lengthOfLongestSubstringHandlesEmptyString() {
        assertEquals(0, LongestNonRepeatingSubString.lengthOfLongestSubstring(""));
    }

    // Check single character string
    @Test void lengthOfLongestSubstringHandlesSingleCharacter() {
        assertEquals(1, LongestNonRepeatingSubString.lengthOfLongestSubstring("a"));
    }

    // Check case where longest window is in the middle of the string
    @Test void lengthOfLongestSubstringFindsWindowInMiddle() {
        assertEquals(3, LongestNonRepeatingSubString.lengthOfLongestSubstring("pwwkew"));
    }

    // Check case with repeated pair of characters
    @Test void lengthOfLongestSubstringHandlesRepeatedPair() {
        assertEquals(2, LongestNonRepeatingSubString.lengthOfLongestSubstring("abba"));
    }
}
