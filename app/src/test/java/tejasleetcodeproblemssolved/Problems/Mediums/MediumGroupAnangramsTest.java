package tejasleetcodeproblemssolved.Problems.Mediums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MediumGroupAnangramsTest {

    // groupAnagrams groups strings into buckets, but bucket order and word order
    // within a bucket depend on hash iteration order, so compare content ignoring order.
    private static List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> sortedGroups = new ArrayList<>();
        for (List<String> group : groups) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            sortedGroups.add(sortedGroup);
        }
        sortedGroups.sort((a, b) -> a.get(0).compareTo(b.get(0)));
        return sortedGroups;
    }

    // Check normal case with multiple anagram groups and a non-anagram word
    @Test void groupAnagramsGroupsMatchingAnagramsTogether() {
        String[] strs = {"rcas", "scar", "tan", "cars", "ant"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("cars", "rcas", "scar"),
                Arrays.asList("ant", "tan")
        );

        assertEquals(normalize(expected), normalize(MediumGroupAnangrams.groupAnagrams(strs)));
    }

    // Check case where no words are anagrams of each other
    @Test void groupAnagramsKeepsDistinctWordsSeparate() {
        String[] strs = {"cat", "dog", "bird"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bird"),
                Arrays.asList("cat"),
                Arrays.asList("dog")
        );

        assertEquals(normalize(expected), normalize(MediumGroupAnangrams.groupAnagrams(strs)));
    }

    // Check empty input array
    @Test void groupAnagramsHandlesEmptyArray() {
        assertEquals(new ArrayList<>(), MediumGroupAnangrams.groupAnagrams(new String[] {}));
    }

    // Check single word input
    @Test void groupAnagramsHandlesSingleWord() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("solo"));

        assertEquals(normalize(expected), normalize(MediumGroupAnangrams.groupAnagrams(new String[] {"solo"})));
    }

    // Check case where all words are anagrams of each other
    @Test void groupAnagramsHandlesAllWordsInOneGroup() {
        String[] strs = {"eat", "tea", "ate"};

        List<List<String>> expected = Arrays.asList(Arrays.asList("ate", "eat", "tea"));

        assertEquals(normalize(expected), normalize(MediumGroupAnangrams.groupAnagrams(strs)));
    }

    // Check case with duplicate identical words
    @Test void groupAnagramsHandlesDuplicateWords() {
        String[] strs = {"aa", "aa"};

        List<List<String>> expected = Arrays.asList(Arrays.asList("aa", "aa"));

        assertEquals(normalize(expected), normalize(MediumGroupAnangrams.groupAnagrams(strs)));
    }
}
