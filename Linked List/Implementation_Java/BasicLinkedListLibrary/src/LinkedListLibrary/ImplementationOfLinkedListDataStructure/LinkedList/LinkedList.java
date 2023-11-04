package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

public interface LinkedList {
    // Linked List Methods
    public  void displayLinkedList();
    public  void displayNodeByIndex(int index);
    public  void popNodeAtTheEnd(int newNodeValue);
    public  void popNodeByIndex(int newNodeValue, int index);
    public  void deleteNodeByIndex(int index);
    public  void updateNodeByIndex(int value, int index);
    public  boolean isLinkedListEmpty();

}
