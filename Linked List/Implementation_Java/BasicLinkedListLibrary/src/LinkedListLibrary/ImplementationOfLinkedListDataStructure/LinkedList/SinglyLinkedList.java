package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.Node;
import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.SingleLLNode;

public class SinglyLinkedList extends LinkedList{

    public SinglyLinkedList(){
        this.headNode = new SingleLLNode(null);
        this.currentNode = headNode;
    }

    @Override
    public void displayLinkedList() {
        Node currentNode = this.headNode;
        while(currentNode.nextNode!=null){
            currentNode = currentNode.nextNode;
            System.out.print(currentNode.data + " ");
        }
        System.out.println();
    }

    @Override
    public void displayNodeByIndex(int index) {
        Node currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.data);
    }

    @Override
    public void popNodeAtTheEnd(int newNodeValue) {
        SingleLLNode newNode = new SingleLLNode(newNodeValue, null);
        this.currentNode.nextNode = newNode;
        this.currentNode = newNode;
    }

    @Override
    public void popNodeByIndex(int newNodeValue, int index) {
        Node currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = new SingleLLNode(newNodeValue, currentNode.nextNode);
    }

    @Override
    public void deleteNodeByIndex(int index) {
        Node currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        Node deletingNode = currentNode.nextNode;
        currentNode.nextNode = deletingNode.nextNode;

    }

    @Override
    public void updateNodeByIndex(int value, int index) {
        Node currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.data = value;
    }

}
