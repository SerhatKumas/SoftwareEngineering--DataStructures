package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class SingleLLNode extends Node{

    public SingleLLNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public SingleLLNode(int value, Node nextNode){
        this.data = value;
        this.nextNode = nextNode;
    }
}
