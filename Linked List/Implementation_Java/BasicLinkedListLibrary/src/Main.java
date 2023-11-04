import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.DoublyLinkedList;
import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        //Driver Code
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.popNodeAtTheEnd(15);
        linkedList.popNodeAtTheEnd(20);
        linkedList.popNodeAtTheEnd(25);
        linkedList.popNodeAtTheEnd(30);
        linkedList.popNodeAtTheEnd(35);
        linkedList.popNodeAtTheEnd(40);
        linkedList.popNodeAtTheEnd(45);
        linkedList.popNodeByIndex(10, 0);
        linkedList.displayLinkedList();
    }
}