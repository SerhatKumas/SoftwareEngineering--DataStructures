package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class SingleLLNode{

    public int data;
    public SingleLLNode nextNode;

    public SingleLLNode(SingleLLNode nextNode){
        this.nextNode = nextNode;
    }

    public SingleLLNode(int value, SingleLLNode nextNode){
        this.data = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        if(nextNode!= null){
            return "SingleLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    '}';
        }
        else{
            return "SingleLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
}
