package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.DoublyLLNode;

public class DoublyLinkedList implements LinkedList {

    //Starting Node
    public DoublyLLNode headNode;

    //Current Node to pop new elements
    public DoublyLLNode currentNode;

    //Linked List Initializer
    public DoublyLinkedList(){
        this.headNode = new DoublyLLNode(null,null);
        this.currentNode = headNode;
    }

    //Display Method
    @Override
    public void displayLinkedList() {
        DoublyLLNode currentNode = this.headNode;
        do{
            System.out.println(currentNode.toString());
            currentNode = currentNode.nextNode;
        }while(currentNode.nextNode!=null);
        System.out.println();
    }

    //Display by Index Method
    @Override
    public void displayNodeByIndex(int index) {
        DoublyLLNode currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.data);
    }

    //Adding element to Linked List
    @Override
    public void popNodeAtTheEnd(int newNodeValue) {
        DoublyLLNode newNode = new DoublyLLNode(newNodeValue, this.currentNode, null);
        this.currentNode.nextNode = newNode;
        this.currentNode = newNode;
    }

    //Adding element to Linked List by index
    @Override
    public void popNodeByIndex(int newNodeValue, int index) {
        DoublyLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        DoublyLLNode newNode = new DoublyLLNode(newNodeValue, currentNode.nextNode, currentNode);
        DoublyLLNode connectingNode = currentNode.nextNode;
        connectingNode.previousNode = newNode;
        currentNode.nextNode = newNode;
    }

    //Deleting element by index
    @Override
    public void deleteNodeByIndex(int index) {
        DoublyLLNode currentNode = this.headNode;
        for(int i = 0 ; i < index ; i++){
            currentNode = currentNode.nextNode;
        }
        DoublyLLNode deletingNode = currentNode.nextNode;
        DoublyLLNode connectingNode = deletingNode.nextNode;
        connectingNode.previousNode = currentNode;
        currentNode.nextNode = connectingNode;

    }

    //Updating element by index
    @Override
    public void updateNodeByIndex(int value, int index) {
        DoublyLLNode currentNode = this.headNode;
        for(int i = 0 ; i <= index ; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.data = value;
    }

}
