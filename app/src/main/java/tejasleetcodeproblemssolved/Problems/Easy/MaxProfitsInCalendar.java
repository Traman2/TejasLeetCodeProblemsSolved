package tejasleetcodeproblemssolved.Problems.Easy;

public class MaxProfitsInCalendar {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;

        while(r < prices.length){
            if(prices[l] > prices[r]){
                l = r;
            }
            else {
                maxP = Math.max(maxP, prices[r] - prices[l]);
            }
            r++;
        }

        return maxP;
    }

    public static void main(String[] args) {
        int answer = maxProfit(new int[] {10,1,5,6,7,1}); //Should equal 6
        System.out.println("Result: " + answer);
    }
}
