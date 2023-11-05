package ImplementationOfStackAbstractDataStructure.ObjectOriented;

public class Node {
    public int data;
    public Node previousNode;

    public Node(int data, Node previousNode) {
        this.data = data;
        this.previousNode = previousNode;
    }

    public Node(Node previousNode) {
        this.previousNode = previousNode;
    }
}
