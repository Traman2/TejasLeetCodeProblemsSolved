package tejasleetcodeproblemssolved.Problems.Mediums;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> dict = new HashSet<>();
        int longest = 0;
        int left = 0;

        for(int i = 0; i < s.length(); i++){
            while(dict.contains(s.charAt(i))){
                dict.remove(s.charAt(left));
                left++;
            }
            
            longest = Math.max(longest, i - left + 1);
            dict.add(s.charAt(i));
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("acbdfcghlnpqrs"));
    }
}
