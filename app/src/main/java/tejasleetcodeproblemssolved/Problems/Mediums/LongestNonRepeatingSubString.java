package tejasleetcodeproblemssolved.Problems.Mediums;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> dict = new HashSet<>();
        int longest = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            // Contains Duplication
            while(dict.contains(s.charAt(right))){
                   dict.remove(s.charAt(left));
                   left++;
            }

            longest = Math.max(longest, right - left + 1);
            dict.add(s.charAt(right));
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abacadaeafagahaiajakalamanaoap"));
    }
}
