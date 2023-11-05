package ImplementationOfStackAbstractDataStructure.ObjectOriented;

public class Stack {

    /* I studied Stack Data Structure after learning about Linked List, that's why I came up with similar implementation to Linked implementation.
    It is not the most efficient one, but I liked it cause with only putting previous node into node, it would create one way data structure such as Stack
    */

    //Starter Node pointer
    public Node bottomNode;

    //Top Node pointer
    public Node topNode;

    //Size determined by the user
    int fixedSize;

    //Element counter in the stack
    int count = 0;

    //Constructor for Stack
    public Stack(int fixedSize) {
        bottomNode = new Node(null);
        topNode = bottomNode;
        this.fixedSize = fixedSize;
    }

    //Method for adding element to stack
    public void push(int data){
        if(count < fixedSize){
            topNode = new Node(data, topNode);
            count++;
        }
        else {
            System.out.println("Overflow Error : Out of stack boundary.");
        }
    }

    //Method for deleting element from stack
    public void pop(){
        if(count > 0){
            topNode = topNode.previousNode;
            count--;
        }
        else {
            System.out.println("Under Error : No element in stack.");
        }
    }

    //Displaying stack from top to bottom
    public void display(){
        Node pointer = topNode;
        while (pointer!=bottomNode){
            System.out.print(pointer.data + " ");
            pointer = pointer.previousNode;
        }
        System.out.println();
    }

    //Returning the top element of the stack
    public String peek(){
        if (count != 0 && topNode != bottomNode ){
            return String.valueOf(topNode.data);
        }
        else {
            return "Stack is empty.";
        }
    }

    //Checking the whether stack is empty
    public boolean isEmpty(){
        return count == 0 && topNode == bottomNode;
    }

    //Checking the whether stack is full
    public boolean isFull(){
        return count == fixedSize && topNode != bottomNode;
    }

    //Returning the determined stack of size
    public int getSize(){
        return fixedSize;
    }

    //Returning the element count of stack
    public int getCurrentElementCount(){
        return count;
    }
}
