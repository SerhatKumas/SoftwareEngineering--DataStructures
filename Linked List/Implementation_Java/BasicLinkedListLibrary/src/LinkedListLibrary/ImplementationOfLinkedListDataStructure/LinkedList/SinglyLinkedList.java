package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.SingleLLNode;

public class SinglyLinkedList implements LinkedList{

    public SingleLLNode headNode;
    public SingleLLNode currentNode;
    public SinglyLinkedList(){
        this.headNode = new SingleLLNode(null);
        this.currentNode = headNode;
    }

    @Override
    public void displayLinkedList() {
        SingleLLNode currentNode = this.headNode;
        do{
            System.out.println(currentNode.toString());
            currentNode = currentNode.nextNode;
        }while(currentNode.nextNode!=null);
        System.out.println();
    }

    @Override
    public void displayNodeByIndex(int index) {
        SingleLLNode currentNode = this.headNode;
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
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = new SingleLLNode(newNodeValue, currentNode.nextNode);
    }

    @Override
    public void deleteNodeByIndex(int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        SingleLLNode deletingNode = currentNode.nextNode;
        currentNode.nextNode = deletingNode.nextNode;

    }

    @Override
    public void updateNodeByIndex(int value, int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.data = value;
    }

}
