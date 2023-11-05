package ImplementationOfStackAbstractDataStructure.WithLinkedList;

import ImplementationOfStackAbstractDataStructure.ObjectOriented.Node;

import java.util.LinkedList;

public class Stack {
     LinkedList<Integer> stack = new LinkedList<>();

    //Constructor for Stack

    //Method for adding element to stack
    public void push(int data){
        stack.addLast(data);
    }

    //Method for deleting element from stack
    public void pop(){
        stack.removeLast();
    }

    //Displaying stack from top to bottom
    public void display(){
        int index = stack.size()-1;
        while (index >= 0){
            System.out.print(stack.get(index) + " ");
            index--;
        }
        System.out.println();

        //System.out.println(stack);
    }

    //Returning the top element of the stack
    public String peek(){
        return String.valueOf(stack.getLast());
    }

    //Checking the whether stack is empty
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    //Returning the determined stack of size
    public int getSize(){
    return stack.size();
    }

}
