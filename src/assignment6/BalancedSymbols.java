package assignment6;

import java.util.Scanner;
import java.util.Stack;

public class BalancedSymbols {
    public static void main(String[] args) {
        /*boolean ch= areCheck("[]");
        System.out.println(ch);
        String expr = "([{}])";*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the expression  {, }, (, ), [, ] to check");
        String expr = s.next();
        // Function call
        if (areCheck(expr))
            System.out.println("The Symbols are Balanced ");
        else
            System.out.println("The Symbols are Not Balanced ");
    }

    public static boolean areCheck(String expr) {
        /*Scanner s = new Scanner(System.in);
        System.out.println("Enter the expression  {, }, (, ), [, ] to check");
        String input = s.next()*/
        Stack<Character> stack = new Stack<>();
        //if (stack == null || expr.length() == 0) return false;
        for (int i = 0; i < expr.length(); i++) {
            char n = expr.charAt(i);

            if ((n == '{' || n == '(' || n == '[')) {

                stack.push(n);
            }
                if (stack.isEmpty()){
                    return false;

            }  if ((n == ')')) {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } if ((n == '}')) {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } if ((n == ']')) {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;

                }
            }
        }
        return stack.isEmpty();

    }
}