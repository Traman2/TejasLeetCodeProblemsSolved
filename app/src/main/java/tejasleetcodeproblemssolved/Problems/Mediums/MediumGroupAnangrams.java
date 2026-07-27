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
            char[] charArr = s.toCharArray(); // toCharArray() converts String --> char[]
            Arrays.sort(charArr); //Arrays uility function sort does what it means
            String sortedS = new String(charArr); //new String(char[]) coverts char[] --> String
            answer.putIfAbsent(sortedS, new ArrayList<>()); //putIfAbsent() is a put method but only if key is not there first
            answer.get(sortedS).add(s); //get() is to retrive value from key
        }

        return new ArrayList<>(answer.values()); //Returns 2D array of the hashmap
    }

    public static void main(String[] args) {
        //Problem 1: Anagram classification
        String[] strs = {"rcas", "scar", "tan", "cars", "ant"};
        System.out.println(groupAnagrams(strs));
    }
}
