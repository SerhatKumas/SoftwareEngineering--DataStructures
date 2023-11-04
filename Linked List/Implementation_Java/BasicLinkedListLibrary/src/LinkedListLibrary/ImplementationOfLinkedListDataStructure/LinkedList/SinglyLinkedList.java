package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.SingleLLNode;

public class SinglyLinkedList implements LinkedList{

    //Starting Node
    public SingleLLNode headNode;

    //Current Node to pop new elements
    public SingleLLNode currentNode;

    //Linked List Initializer
    public SinglyLinkedList(){
        this.headNode = new SingleLLNode(null);
        this.currentNode = headNode;
    }

    //Display Method
    @Override
    public void displayLinkedList() {
        SingleLLNode currentNode = this.headNode;
        do{
            currentNode = currentNode.nextNode;
            System.out.println(currentNode.toString());
        }while(currentNode.nextNode!=null);
        System.out.println();
    }

    //Display by Index Method
    @Override
    public void displayNodeByIndex(int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.data);
    }

    //Adding element to Linked List
    @Override
    public void popNodeAtTheEnd(int newNodeValue) {
        SingleLLNode newNode = new SingleLLNode(newNodeValue, null);
        this.currentNode.nextNode = newNode;
        this.currentNode = newNode;
    }

    //Adding element to Linked List by index
    @Override
    public void popNodeByIndex(int newNodeValue, int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = new SingleLLNode(newNodeValue, currentNode.nextNode);
    }

    //Deleting element by index
    @Override
    public void deleteNodeByIndex(int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        SingleLLNode deletingNode = currentNode.nextNode;
        currentNode.nextNode = deletingNode.nextNode;

    }

    //Updating element by index
    @Override
    public void updateNodeByIndex(int value, int index) {
        SingleLLNode currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.data = value;
    }

    @Override
    public boolean isLinkedListEmpty() {
        return headNode.nextNode == null;
    }

}
