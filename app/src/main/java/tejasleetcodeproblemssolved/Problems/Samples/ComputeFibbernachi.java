package tejasleetcodeproblemssolved.Problems.Samples;

import java.math.BigInteger;

public class ComputeFibbernachi {
    public static BigInteger fibCalculator(int index){
        // if(index <= 2) return 1;
        // else return fibCalculator(index - 1) + fibCalculator(index - 2);

        BigInteger previous = BigInteger.ONE;
        BigInteger current = BigInteger.ZERO; //increment by 1
        BigInteger answer = BigInteger.ZERO;
        for(int i = 0; i < index; i++){
            answer = previous.add(current);
            previous = current;
            current = answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fibCalculator(50));
    }
}
