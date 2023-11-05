package LinkedListLibrary.LinkedListPredefinedMethods;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        //Initiation of Linked List
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //Addition element to Linked List
        linkedList.add(3);linkedList.add(4);linkedList.add(5);linkedList.add(6);linkedList.add(7);linkedList.add(8);linkedList.add(9);linkedList.add(10);
        linkedList.add(11);linkedList.add(12);linkedList.add(13);linkedList.add(14);linkedList.add(15);linkedList.add(16);linkedList.add(17);linkedList.add(18);
        //Addition element to Linked List by index
        linkedList.add(1,4);
        //Addition element at the beginning of the Linked List
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        //Addition element at the end of the Linked List
        linkedList.addLast(19);
        linkedList.addLast(20);
        System.out.println(linkedList);
        //Removing the element by index
        linkedList.remove(0);
        //Removing the first element of the Linked List
        linkedList.removeFirst();
        //Removing the last element of the Linked List
        linkedList.removeLast();
        System.out.println(linkedList);
        //Updating element in Linked List
        linkedList.set(1,5);
        System.out.println(linkedList);
        //Getting element in Linked List
        System.out.println(linkedList.get(6));
        //Getting first element of Linked List
        System.out.println(linkedList.getFirst());
        //Getting last element of Linked List
        System.out.println(linkedList.getLast());
        //Getting index of the element given in the parameter
        System.out.println(linkedList.indexOf(16));
        //Checking whether element is existed in the Linked List
        System.out.println(linkedList.contains(5));
        //Clears and deletes element in Linked List
        linkedList.clear();
        System.out.println(linkedList);

        //Reference
        //https://www.geeksforgeeks.org/linked-list-in-java/ -> For more implementation and method explanations
    }
}
