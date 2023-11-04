package LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node;

public class DoublyLLNode {

    public int data;
    public DoublyLLNode nextNode;
    public DoublyLLNode previousNode;

    public DoublyLLNode(int value, DoublyLLNode nextNode, DoublyLLNode previousNode) {
        this.previousNode = previousNode;
        this.data = value;
        this.nextNode = nextNode;
    }

    public DoublyLLNode(DoublyLLNode nextNode, DoublyLLNode previousNode) {
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        if (nextNode != null && previousNode != null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    ", previousNode=" + previousNode.data +
                    '}';
        } else if (previousNode == null && nextNode != null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode.data +
                    ", previousNode=" + previousNode +
                    '}';
        } else if (previousNode != null && nextNode == null) {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    ", previousNode=" + previousNode.data +
                    '}';
        } else {
            return "DoublyLLNode{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    ", previousNode=" + previousNode +
                    '}';
        }
    }
}
