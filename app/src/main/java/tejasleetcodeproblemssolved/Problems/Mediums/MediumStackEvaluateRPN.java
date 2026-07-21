package tejasleetcodeproblemssolved.Problems.Mediums;
import java.util.Stack;

public class MediumStackEvaluateRPN {
    
    public static void main(String[] args) {
        Stack<Integer> answer = new Stack<>();
        String[] tokens = {"1","2","+","3","*","4","-"};

        for(String token : tokens){
            //Solve and push
            switch(token){
                case "+":
                    answer.push(answer.pop() + answer.pop());
                    break;
                case "*":
                    answer.push(answer.pop() * answer.pop());
                    break;
                case "-":{
                    int x = answer.pop();
                    int y = answer.pop();
                    answer.push(y - x);
                    break;
                }
                case "/":{
                    int x = answer.pop();
                    int y = answer.pop();
                    answer.push(y / x);
                    break;
                }
                default:
                    answer.push(Integer.parseInt(token));
            }
        }
        System.out.println(answer.peek());
    }
}
