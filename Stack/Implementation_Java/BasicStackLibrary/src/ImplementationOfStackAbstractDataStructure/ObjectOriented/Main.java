package ImplementationOfStackAbstractDataStructure.ObjectOriented;

import ImplementationOfStackAbstractDataStructure.ObjectOriented.Stack;

public class Main {
    public static void main(String[] args) {
        // Object Oriented Abstract Data Driver Code
        Stack stack = new Stack(5);

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.peek());

        //Adding element to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.peek());

        //Displaying Stack
        stack.display();

        //Deleting element from the stack
        stack.pop();
        stack.pop();

        //Displaying Stack
        stack. display();

        System.out.println(stack.getSize());
        System.out.println(stack.getCurrentElementCount());
    }
}