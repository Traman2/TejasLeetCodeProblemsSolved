package tejasleetcodeproblemssolved.Problems.Mediums;

public class FindMinOnRotatedPivot {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = (r + l) / 2;
            if(nums[mid] < nums[r]) r = mid;           
            else l = mid + 1;
        }

        return nums[l];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {40, 50, 60, 10, 20})); //answer is 10, index 3
    }
}
