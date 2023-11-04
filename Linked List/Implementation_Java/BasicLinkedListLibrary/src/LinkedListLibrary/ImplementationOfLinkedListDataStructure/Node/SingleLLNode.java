package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class SingleLLNode{
    //Node structure in Doubly Linked List -> data - next node
    public int data;
    public SingleLLNode nextNode;

    //Constructor for head node
    public SingleLLNode(SingleLLNode nextNode){
        this.nextNode = nextNode;
    }

    //Constructor for node creation
    public SingleLLNode(int value, SingleLLNode nextNode){
        this.data = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        //To string method for Linked List nodes
        if(nextNode!= null){
            return "SingleLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    '}';
        }
        //To string method for tail nodes
        else{
            return "SingleLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
}
