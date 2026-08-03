package tejasleetcodeproblemssolved.Problems.Mediums;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediumGroupAnangrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedS = new String(charArr);
            answer.putIfAbsent(sortedS, new ArrayList<>());
            answer.get(sortedS).add(s);
        }

        return new ArrayList<>(answer.values());
    }

    public static void main(String[] args) {
        //Problem 1: Anagram classification
        String[] strs = {"rcas", "scar", "tan", "cars", "ant"};
        System.out.println(groupAnagrams(strs));
    }
}
