package tejasleetcodeproblemssolved.Problems.Easy;

public class MaximumSlidingWindow {
    
    public static int MaxSlidingWindowSolution(int[] arr, int k){
        int currentSum = 0;

        for(int i = 0; i < k; i++){
            currentSum += arr[i];
        }

        int maxValue = currentSum;

        for(int l = 0; l < arr.length - k; l++){
            int leaving = arr[l];
            int entering = arr[l + k];
            currentSum = currentSum - leaving + entering;
            
            if(currentSum > maxValue) maxValue = currentSum;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(MaxSlidingWindowSolution(new int[] {10, 2, 40, 20, 13, 45, 23}, 3)); //Answer is 123 + 43 + 13
    }
}
