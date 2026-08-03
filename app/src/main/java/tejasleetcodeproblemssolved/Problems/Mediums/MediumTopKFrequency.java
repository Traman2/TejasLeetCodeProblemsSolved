package tejasleetcodeproblemssolved.Problems.Mediums;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MediumTopKFrequency {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencMap = new HashMap<>();
        for(int num : nums){
            frequencMap.putIfAbsent(num, 0);
            frequencMap.put(num, frequencMap.get(num) + 1);
        }

        // Still need to learn this API of java for sorting
        ArrayList<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(frequencMap.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = sorted.get(i).getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
