package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class DoublyLLNode {
    //Node structure in Doubly Linked List -> previous node - data - next node
    public int data;
    public DoublyLLNode nextNode;
    public DoublyLLNode previousNode;

    //Constructor for node creation
    public DoublyLLNode(int value, DoublyLLNode nextNode, DoublyLLNode previousNode) {
        this.previousNode = previousNode;
        this.data = value;
        this.nextNode = nextNode;
    }

    //Constructor for head node
    public DoublyLLNode(DoublyLLNode nextNode, DoublyLLNode previousNode) {
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        //To string method for Linked List nodes
        if (nextNode != null && previousNode != null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    ", previousNode=" + previousNode.data +
                    '}';
        }
        //To string method for head node
        else if (previousNode == null && nextNode != null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    ", previousNode=" + previousNode +
                    '}';
        }
        //To string method for tail node
        else if (previousNode != null && nextNode == null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    ", previousNode=" + previousNode.data +
                    '}';
        }
        //To string method for fully null nodes
        else {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    ", previousNode=" + previousNode +
                    '}';
        }
    }
}
