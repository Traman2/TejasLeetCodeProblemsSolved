package tejasleetcodeproblemssolved.Problems.Easy;

public class PrintASCII {
    public static void printAscii(int n){
        int space = n - 1;
        int starCount = 1;
        
        for(int i = 0; i < n; i++){
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int c = 0; c < starCount; c++){
                System.out.print("*");
            }
            
            starCount += 2;
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAscii(3);
    }
}
