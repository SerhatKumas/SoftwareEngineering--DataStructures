import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.DoublyLinkedList;
import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        //Double Linked List Initialization
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //is linked list empty check
        System.out.println(doublyLinkedList.isLinkedListEmpty());
        //Addition to the linked list
        doublyLinkedList.popNodeAtTheEnd(20);
        doublyLinkedList.popNodeAtTheEnd(25);
        doublyLinkedList.popNodeAtTheEnd(30);
        doublyLinkedList.popNodeAtTheEnd(35);
        doublyLinkedList.popNodeAtTheEnd(40);
        doublyLinkedList.popNodeAtTheEnd(45);
        //Addition to the end of the linked list
        doublyLinkedList.popNodeByIndex(10, 0);
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
        singlyLinkedList.popNodeAtTheEnd(20);
        singlyLinkedList.popNodeAtTheEnd(25);
        singlyLinkedList.popNodeAtTheEnd(30);
        singlyLinkedList.popNodeAtTheEnd(35);
        singlyLinkedList.popNodeAtTheEnd(40);
        singlyLinkedList.popNodeAtTheEnd(45);
        //Addition to the end of the linked list
        singlyLinkedList.popNodeByIndex(10, 0);
        //Updating the element of the linked list
        singlyLinkedList.updateNodeByIndex(50,5);
        //Removing the element from the linked list
        singlyLinkedList.deleteNodeByIndex(5);
        //is linked list empty check
        System.out.println(singlyLinkedList.isLinkedListEmpty());
        singlyLinkedList.displayLinkedList();
    }
}