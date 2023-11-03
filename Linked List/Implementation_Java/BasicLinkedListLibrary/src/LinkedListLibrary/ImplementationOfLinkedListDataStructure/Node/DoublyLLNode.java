package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class DoublyLLNode extends Node{

    Node previousNode;

    public DoublyLLNode(int value, DoublyLLNode previousNode, DoublyLLNode nextNode){
        this.previousNode = previousNode;
        this.data = value;
        this.nextNode = nextNode;
    }

}
