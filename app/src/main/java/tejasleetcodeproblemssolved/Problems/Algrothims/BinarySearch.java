package tejasleetcodeproblemssolved.Problems.Algrothims;

public class BinarySearch {

    public static int binarySearchAlgrothim(int[] arr, int target){
        int minIndex = 0;
        int maxIndex = arr.length - 1;

        while(minIndex <= maxIndex){
            int middleIndex = (minIndex + maxIndex) / 2;
            if(arr[middleIndex] == target) return middleIndex;
            else if(target > arr[middleIndex]) minIndex = middleIndex + 1;
            else maxIndex = middleIndex - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sorted = {1, 2, 4, 5, 8, 9, 14};
        int target = 8;

        System.out.println(binarySearchAlgrothim(sorted, target));
    }
}