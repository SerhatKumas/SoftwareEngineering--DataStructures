package PredefinedStackMethods;

import java.util.Stack;

public class PredefinedMethods {
    public static void main(String[] args) {
        //Initialization of stack d
        Stack<Integer> stack = new Stack<>();

        //Adding element to stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //Deleting element from stack
        stack.pop();

        //Last element of the stack
        System.out.println(stack.peek());
        //Checking whether stack is empty or not
        System.out.println(stack.isEmpty());
        //Checking the size of the stack, it can be grown when you add element
        System.out.println(stack.capacity());

        //Referance : https://www.geeksforgeeks.org
    }
}
