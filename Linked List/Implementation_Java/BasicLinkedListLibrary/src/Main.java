import LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        //Driver Code
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.displayLinkedList();
        singlyLinkedList.popNodeAtTheEnd(15);
        singlyLinkedList.popNodeAtTheEnd(20);
        singlyLinkedList.popNodeAtTheEnd(25);
        singlyLinkedList.popNodeAtTheEnd(26);
        singlyLinkedList.popNodeAtTheEnd(35);
        singlyLinkedList.popNodeAtTheEnd(40);
        singlyLinkedList.popNodeAtTheEnd(45);
        singlyLinkedList.updateNodeByIndex(30,3);
        singlyLinkedList.displayLinkedList();
    }
}