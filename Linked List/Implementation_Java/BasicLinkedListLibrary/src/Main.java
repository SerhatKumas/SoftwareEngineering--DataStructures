import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.DoublyLinkedList;
import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        //Double Linked List Initialization
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //is linked list empty check
        System.out.println(doublyLinkedList.isLinkedListEmpty());
        //Addition to the linked list
        doublyLinkedList.addNodeAtTheEnd(20);
        doublyLinkedList.addNodeAtTheEnd(25);
        doublyLinkedList.addNodeAtTheEnd(30);
        doublyLinkedList.addNodeAtTheEnd(35);
        doublyLinkedList.addNodeAtTheEnd(40);
        doublyLinkedList.addNodeAtTheEnd(45);
        //Addition to the end of the linked list
        doublyLinkedList.addNodeByIndex(10, 0);
        //Updating the element of the linked list
        doublyLinkedList.updateNodeByIndex(50,5);
        //Removing the element from the linked list
        doublyLinkedList.deleteNodeByIndex(5);
        //is linked list empty check
        System.out.println(doublyLinkedList.isLinkedListEmpty());
        doublyLinkedList.displayLinkedList();

        // --------------------------------------------------------------

        //Singly Linked List Initialization
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        //is linked list empty check
        System.out.println(singlyLinkedList.isLinkedListEmpty());
        //Addition to the linked list
        singlyLinkedList.addNodeAtTheEnd(20);
        singlyLinkedList.addNodeAtTheEnd(25);
        singlyLinkedList.addNodeAtTheEnd(30);
        singlyLinkedList.addNodeAtTheEnd(35);
        singlyLinkedList.addNodeAtTheEnd(40);
        singlyLinkedList.addNodeAtTheEnd(45);
        //Addition to the end of the linked list
        singlyLinkedList.addNodeByIndex(10, 0);
        //Updating the element of the linked list
        singlyLinkedList.updateNodeByIndex(50,5);
        //Removing the element from the linked list
        singlyLinkedList.deleteNodeByIndex(5);
        //is linked list empty check
        System.out.println(singlyLinkedList.isLinkedListEmpty());
        singlyLinkedList.displayLinkedList();
    }
}