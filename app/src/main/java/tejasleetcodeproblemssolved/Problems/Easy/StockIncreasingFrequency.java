package tejasleetcodeproblemssolved.Problems.Easy;

public class StockIncreasingFrequency {

    public static int solution(int[] arr, int k){
        if(arr.length < k) return 0;

        int streak = 1;
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] > arr[i]) streak++;
            else streak = 1;
            if(streak >= k) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int result = solution(new int[]{1, 2, 4, 6, 16, 3, 6, 12, 20, 25, 28, 1, 2, 3}, 3);

        System.out.println("Result: " + result); //Answer should be 8
    }
}
