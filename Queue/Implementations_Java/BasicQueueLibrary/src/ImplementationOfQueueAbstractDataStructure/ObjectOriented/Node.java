package ImplementationOfQueueAbstractDataStructure.ObjectOriented;

public class Node {

    //Queue Node class which is similar to Singly Linked List
    //We can access next node from previous node
    public int data;
    public Node nextNode;

    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}
