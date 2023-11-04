package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

public interface LinkedList {
    // Linked List Methods
    public abstract void displayLinkedList();
    public abstract void displayNodeByIndex(int index);
    public abstract void popNodeAtTheEnd(int newNodeValue);
    public abstract void popNodeByIndex(int newNodeValue, int index);
    public abstract void deleteNodeByIndex(int index);
    public abstract void updateNodeByIndex(int value, int index);

}
