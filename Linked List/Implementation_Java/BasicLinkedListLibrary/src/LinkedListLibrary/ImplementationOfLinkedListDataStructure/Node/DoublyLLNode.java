package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class DoublyLLNode extends Node{

    public Node previousNode;

    public DoublyLLNode(int value, Node previousNode, Node nextNode){
        this.previousNode = previousNode;
        this.data = value;
        this.nextNode = nextNode;
    }

    public DoublyLLNode(Node nextNode, Node previousNode){
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }
}
