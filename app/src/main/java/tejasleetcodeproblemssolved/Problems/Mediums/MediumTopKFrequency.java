package tejasleetcodeproblemssolved.Problems.Mediums;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MediumTopKFrequency {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        //SOLUTION
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.putIfAbsent(num, 0);
            count.put(num, count.get(num) + 1);
        }

        /// HashMap methods into arrays
        /// variable.entrySet() gives an array of the key to the set of values entries
        /// Map.Entry<type, type> is basically the individual entries of a HashMap
        ArrayList<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(count.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        int[] answer = new int[k];
        for(int i = 0; i < k; i ++){
            answer[i] = sorted.get(i).getValue();
        }

        System.out.println(Arrays.toString(answer));

    }
}
