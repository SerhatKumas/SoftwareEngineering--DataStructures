package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

public interface LinkedList {
    // Linked List Methods
    public  void displayLinkedList();
    public  void displayNodeByIndex(int index);
    public  void addNodeAtTheEnd(int newNodeValue);
    public  void addNodeByIndex(int newNodeValue, int index);
    public  void deleteNodeByIndex(int index);
    public  void updateNodeByIndex(int value, int index);
    public  boolean isLinkedListEmpty();

}
