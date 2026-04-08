package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackCoding {

    public static boolean validParenthesis(String s) throws StackUnderFlowException1 {
        StackByLinkedList stack = new StackByLinkedList();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.size() > 0 && (c == ')' && stack.peek() == '(') || c == ']' && stack.peek() == '['
                    || c == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    static void closestSmallest(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int x = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    x = arr[j];
                    break;
                }
            }
            System.out.print(x + " ");
        }
    }

    static void closestSmallestUsingStack(int[] arr) throws StackUnderFlowException1{
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(arr[i]);
        }
    }

   public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       System.out.println(validParenthesis(s));
       int[] arr = { 5, 7, 3, 12, 9 };
       //closestSmallest(arr);
       //closestSmallestUsingStack(arr);
       }
}