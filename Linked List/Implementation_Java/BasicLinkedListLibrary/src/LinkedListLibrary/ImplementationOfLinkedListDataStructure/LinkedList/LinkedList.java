package LinkedListLibrary.ImplementationOfLinkedListDataStructure.LinkedList;

import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.Node;
import LinkedListLibrary.ImplementationOfLinkedListDataStructure.Node.SingleLLNode;

public abstract class LinkedList {

    public Node headNode;
    public Node currentNode;

    public abstract void displayLinkedList();
    public abstract void displayNodeByIndex(int index);
    public abstract void popNodeAtTheEnd(int newNodeValue);
    public abstract void popNodeByIndex(int newNodeValue, int index);
    public abstract void deleteNodeByIndex(int index);
    public abstract void updateNodeByIndex(int value, int index);

}
