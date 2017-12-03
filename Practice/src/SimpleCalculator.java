/**
   AlgoSoc 30/11/2017 session problem
   Topic: Stack
   Implement calculators does Prefix notation (Polish notation), Infix notation and Postfix notation (Reverse Polish notation)
 */
import java.util.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expr = in.nextLine();
        System.out.println(postfix(expr));
        in.close();
    }

    public static int postfix(String expr) {
        String[] exprs = expr.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String part : exprs) {
            if (part.equals("+")) {
                int var2 = stack.pop();
                int var1 = stack.pop();
                stack.push(var1 + var2);
            } else if (part.equals("-") || part.equals("−")) {
                int var2 = stack.pop();
                int var1 = stack.pop();
                stack.push(var1 - var2);
            } else if (part.equals("*") || part.equals("×")) {
                int var2 = stack.pop();
                int var1 = stack.pop();
                stack.push(var1 * var2);
            } else if (part.equals("/") || part.equals("÷")) {
                int var2 = stack.pop();
                int var1 = stack.pop();
                stack.push(var1 / var2);
            } else {
                stack.push(Integer.parseInt(part));
            }
        }
        return stack.peek();
    }

}